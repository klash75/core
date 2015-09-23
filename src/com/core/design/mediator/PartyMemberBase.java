package com.core.design.mediator;

/**
 * Created by klash75 on 9/23/2015.
 */
public abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " joins the party");
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this + " " + action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(this + " " + action.toString());
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}
