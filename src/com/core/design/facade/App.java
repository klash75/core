package com.core.design.facade;

/**
 * Created by klash75 on 9/23/2015.
 */
public class App {

    public static void main(String[] args) {
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }

}
