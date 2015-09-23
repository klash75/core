package com.core.design.lazyloading;

import java.util.function.Supplier;

/**
 * Created by klash75 on 9/23/2015.
 * <p>
 * This lazy loader is thread safe and more efficient than {@link HolderThreadSafe}.
 * It utilizes Java 8 functional interface {@link Supplier} as {@link Heavy} factory.
 */
public class Java8Holder {

    private Supplier<Heavy> heavy = () -> createAndCacheHeavy();

    public Heavy getHeavy() {
        return heavy.get();
    }

    private synchronized Heavy createAndCacheHeavy() {
        class HeavyFactory implements Supplier<Heavy> {
            private final Heavy heavyInstance = new Heavy();

            @Override
            public Heavy get() {
                return heavyInstance;
            }
        }
        if (!HeavyFactory.class.isInstance(heavy)) {
            heavy = new HeavyFactory();
        }
        return heavy.get();
    }
}
