package com.core.design.singleton;

/**
 * Created by klash75 on 9/23/2015.
 * <p>
 * Singleton class.
 * Eagerly initialized static instance guarantees thread safety.
 */
public class IvoryTower {

    private static IvoryTower instance = new IvoryTower();

    private IvoryTower() {
    }

    public static IvoryTower getInstance() {
        return instance;
    }

}
