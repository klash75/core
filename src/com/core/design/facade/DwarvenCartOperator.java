package com.core.design.facade;

/**
 * Created by klash75 on 9/23/2015.
 */
public class DwarvenCartOperator extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println(name() + " moves gold chunks out of the mine.");
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
