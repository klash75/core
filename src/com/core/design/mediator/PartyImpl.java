package com.core.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by klash75 on 9/23/2015.
 */
public class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinedParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (PartyMember member : members) {
            if (member != actor) {
                member.partyAction(action);
            }
        }
    }
}
