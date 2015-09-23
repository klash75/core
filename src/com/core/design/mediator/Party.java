package com.core.design.mediator;

/**
 * Created by klash75 on 9/23/2015.
 * <p>
 * Party Interface
 */
public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);
}
