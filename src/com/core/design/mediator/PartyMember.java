package com.core.design.mediator;

/**
 * Created by klash75 on 9/23/2015.
 * <p>
 * Interface for party members interacting with {@link Party}
 */
public interface PartyMember {

    void joinedParty(Party party);

    void partyAction(Action action);

    void act(Action action);

}
