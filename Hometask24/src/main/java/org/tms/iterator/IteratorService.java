package org.tms.iterator;

public class IteratorService {

    public Device findById (Device[] devices, int id) {

        for (int i = 0; i <= devices.length; i++){
            if (devices[i].getId() == id) {
                return devices[i];
            }

        }

        return null;
    }

    public Device findFirst (Device[] devices) {
        return devices[0];
    }

    public Device findLast (Device[] devices) {
        return devices[devices.length - 1];
    }

}
