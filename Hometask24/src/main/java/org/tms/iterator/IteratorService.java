package org.tms.iterator;

public class IteratorService {

    int iterator = -1;

    public Device next(Device[] devices) {

        iterator += 1;

        if (devices[iterator] != null) {
            return devices[iterator];
        } else return next(devices);

    }


}
