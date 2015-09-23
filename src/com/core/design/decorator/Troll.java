package com.core.design.decorator;

/**
 * Created by klash75 on 9/23/2015.
 * <p>
 * Troll implements {@link Hostile} interface directly.
 */
public class Troll implements Hostile {
    @Override
    public void attack() {
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
