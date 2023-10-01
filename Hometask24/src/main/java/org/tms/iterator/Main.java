package org.tms.iterator;

public class Main {

    public static void main(String[] args) {

        IteratorService iteratorService = new IteratorService();

        Device device1 = new Device(1);
        Device device2 = new Device(2);
        Device device3 = new Device(3);
        Device device4 = new Device(4);
        Device device5 = new Device(5);
        Device device6 = new Device(6);

        Device[] devices = {device1, device2, device3, device4, device5, device6};

        Device byId = iteratorService.findById(devices, 4);

        Device first = iteratorService.findFirst(devices);

        Device last = iteratorService.findLast(devices);

        System.out.println(last);

    }

}
