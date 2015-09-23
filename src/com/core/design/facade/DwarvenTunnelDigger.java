package com.core.design.facade;

/**
 * Created by klash75 on 9/23/2015.
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println(name() + " creates another promising tunnel.");
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }
}
