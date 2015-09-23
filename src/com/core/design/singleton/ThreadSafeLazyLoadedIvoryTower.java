package com.core.design.singleton;

/**
 * Created by klash75 on 9/23/2015.
 * Thread-safe singleton class.
 * The instance i lazily initialized and thus needs synchronization mechanism.
 */
public class ThreadSafeLazyLoadedIvoryTower {

    private static ThreadSafeLazyLoadedIvoryTower instance = null;

    private ThreadSafeLazyLoadedIvoryTower() {
    }

    public synchronized static ThreadSafeLazyLoadedIvoryTower getInstance() {
        /**
         * The instance gets created only when it is called for first time.
         * Lazy-loading
         */
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }
        return instance;
    }

}
