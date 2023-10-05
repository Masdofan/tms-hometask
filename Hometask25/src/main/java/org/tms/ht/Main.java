package org.tms.ht;

public class Main {

    public static void main(String[] args) {

        DataReader dataReader = new BufferDataReader(new RandomDataReader());

        for (int i = 0; i < 10; i++) {

            System.out.println(dataReader.read());

        }

    }

}
