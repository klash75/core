package com.core.design.mediator;

/**
 * Created by klash75 on 9/23/2015.
 */
public enum Action {

    HUNT("hunted a rabbit", "arrives for dinner"),
    TALE("tells a tale", "comes to listen"),
    GOLD("found gold", "takes his shares of his gold"),
    ENEMY("spotted enemies", "runs for cover"),
    NONE("", "");

    private String title;
    private String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title;
    }
}
