package com.core.design.adapter;

/**
 * Created by klash75 on 9/23/2015.
 * <p>
 * Device class (adaptee in the pattern)
 */
public class GlobinGlider {

    public void attachGlider() {
        System.out.println("Glider attached.");
    }

    public void gainSpeed() {
        System.out.println("Gaining Speed.");
    }

    public void takeOff() {
        System.out.println("Lift-off!");
    }
}
