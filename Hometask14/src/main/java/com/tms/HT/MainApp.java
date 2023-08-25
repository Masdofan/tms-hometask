package com.tms.HT;

public class MainApp {

    public static void main(String[] args) throws InterruptedException {

        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        Thread thread2 = new Thread(t2);

        t3.start();
        t3.join();
        thread2.start();
        thread2.join();
        t1.start();
        t1.join();


    }

}
