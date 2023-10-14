package org.tms.observer;

import java.util.Observable;

public class User extends Observable {

    private String name;

    public User(String name) {
        this.name = name;

    }

    public void create() {
        System.out.println("go to database");

        setChanged();
        notifyObservers(this);
    }

    public String getName() {
        return name;
    }
}
