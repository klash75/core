package com.core.design.facade;

/**
 * Created by klash75 on 9/23/2015.
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println(name() + " digs for gold");
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }
}
