package com.core.design.lazyloading;

/**
 * Created by klash75 on 9/23/2015.
 */
public class Heavy {

    public Heavy() {
        System.out.println("Creating Heavy...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...Heavy created.");
    }
}
