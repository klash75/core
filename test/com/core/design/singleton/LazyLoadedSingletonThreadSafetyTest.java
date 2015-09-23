package com.core.design.singleton;

import org.junit.Test;

/**
 * Created by klash75 on 9/23/2015.
 */
public class LazyLoadedSingletonThreadSafetyTest {

    private static final int NUM_THREADS = 5;

    @Test
    public void test(){
        SingletonThread runnable = new SingletonThread();
        for (int j = 0; j < NUM_THREADS; j++){
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

    private static class SingletonThread implements Runnable {

        @Override
        public void run(){
            LazyLoaderIvoryTower instance = LazyLoaderIvoryTower.getInstance();
            System.out.println("Thread ="+Thread.currentThread().getName()+ " got instance = "+instance);
        }
    }

    private static class LazyLoaderIvoryTower {
        private static LazyLoaderIvoryTower instance = null;

        private LazyLoaderIvoryTower(){}

        public static LazyLoaderIvoryTower getInstance(){
            if(instance == null){
                instance = new LazyLoaderIvoryTower();
                System.out.println("Thread = "+Thread.currentThread().getName() +" creating instance ="+instance);
            }
            return instance;
        }
    }

}
