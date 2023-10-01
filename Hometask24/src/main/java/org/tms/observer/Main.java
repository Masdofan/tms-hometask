package org.tms.observer;

public class Main {

    public static void main(String[] args) {

        User user = new User("user1");

        BuhService buhService = new BuhService();
        SecurityService securityService = new SecurityService();

        user.addObserver(buhService);
        user.addObserver(securityService);

        user.create();


    }

}
