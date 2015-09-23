package com.core.design.singleton;

/**
 * Created by klash75 on 9/23/2015.
 */
public class ThreadSafeDoubleCheckLocking {

    private static volatile ThreadSafeDoubleCheckLocking INSTANCE;

    /**
     * private constructor to prevent client from instantiating.
     */
    private ThreadSafeDoubleCheckLocking() {
        // to prevent instantiating by Reflection call
        if (INSTANCE != null)
            throw new IllegalStateException("Already Initialized.");
    }

    public static ThreadSafeDoubleCheckLocking getInstance() {
        //local variable increases preformance by 25 percent
        ThreadSafeDoubleCheckLocking result = INSTANCE;
        if (result == null) {
            synchronized (ThreadSafeDoubleCheckLocking.class) {
                result = INSTANCE;
                if (result == null) {
                    INSTANCE = result = new ThreadSafeDoubleCheckLocking();
                }
            }
        }
        return result;
    }

}
