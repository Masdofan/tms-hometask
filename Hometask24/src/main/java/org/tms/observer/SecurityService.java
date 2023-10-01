package org.tms.observer;

import java.util.Observable;
import java.util.Observer;

public class SecurityService implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        if (arg instanceof User) {

            var user = (User)arg;

            System.out.println("create security card for " + user.getName());

        }

    }

}
