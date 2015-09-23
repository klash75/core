package com.core.design.lazyloading;

/**
 * Created by klash75 on 9/23/2015.
 */
public class App {

    public static void main(String[] args) {
        //Simple lazy loader - not thread safe
        HolderNaive holderNaive = new HolderNaive();
        Heavy heavy = holderNaive.getHeavy();
        System.out.println("heavy = " + heavy);

        // Thread safe lazy loader, but with heavy synchronization on each access
        HolderThreadSafe holderThreadSafe = new HolderThreadSafe();
        Heavy another = holderThreadSafe.getHeavy();
        System.out.println("another = " + another);

        // The most efficient lazy loader utilizing Java 8 features
        Java8Holder java8Holder = new Java8Holder();
        Heavy next = java8Holder.getHeavy();
        System.out.println("next = " + next);
    }
}
