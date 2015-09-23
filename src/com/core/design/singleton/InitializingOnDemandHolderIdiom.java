package com.core.design.singleton;

import java.io.Serializable;

/**
 * Created by klash75 on 9/23/2015.
 */
public class InitializingOnDemandHolderIdiom implements Serializable {

    private InitializingOnDemandHolderIdiom() {
    }

    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    private static class HelperHolder {
        public static final InitializingOnDemandHolderIdiom INSTANCE = new InitializingOnDemandHolderIdiom();
    }
}
