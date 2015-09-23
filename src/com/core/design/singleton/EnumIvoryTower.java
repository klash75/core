package com.core.design.singleton;

/**
 * Created by klash75 on 9/23/2015.
 */
public enum EnumIvoryTower {

    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
