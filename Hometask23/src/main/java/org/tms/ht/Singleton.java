package org.tms.ht;

import java.security.Provider;

public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {

        System.out.println("Singleton");

    }

    public static Singleton getINSTANCE() {

        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

}
