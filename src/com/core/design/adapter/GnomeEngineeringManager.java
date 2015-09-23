package com.core.design.adapter;

/**
 * Created by klash75 on 9/23/2015.
 * <p>
 * GnomeEngineering manager uses {@link Engineer} to operate devices.
 */
public class GnomeEngineeringManager implements Engineer {

    private Engineer engineer;

    public GnomeEngineeringManager() {
        engineer = new GnomeEngineer();
    }

    @Override
    public void operateDevice() {
        engineer.operateDevice();
    }
}
