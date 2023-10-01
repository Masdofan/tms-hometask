package org.tms.iterator;

public class Device {

    private int id;

    public Device(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                '}';
    }
}
