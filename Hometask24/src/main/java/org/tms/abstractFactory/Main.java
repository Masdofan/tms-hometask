package org.tms.abstractFactory;

public class Main {

    public static void main(String[] args) {

        Device device = new Device();

        DeviceProcess deviceProcess = new DeviceProcess();

        deviceProcess.doDay(device, new TabletAbstractFactoryServiceImpl());

    }

}
