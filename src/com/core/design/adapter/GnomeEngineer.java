package com.core.design.adapter;

/**
 * Created by klash75 on 9/23/2015.
 * <p>
 * Adapter class. Adapts the interface of the device ({@link GlobinGlider}) into
 * {@link Engineer} interface expected by the client ({@link GnomeEngineeringManager}).
 */
public class GnomeEngineer implements Engineer {

    private GlobinGlider glider;

    public GnomeEngineer() {
        glider = new GlobinGlider();
    }

    @Override
    public void operateDevice() {
        glider.attachGlider();
        glider.gainSpeed();
        glider.takeOff();
    }
}
