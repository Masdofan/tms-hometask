package org.tms.ht;

import java.util.Random;

public class RandomDataReader implements DataReader{

    @Override
    public int read() {
        return new Random().nextInt();
    }
}
