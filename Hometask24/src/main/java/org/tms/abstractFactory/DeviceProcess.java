package org.tms.abstractFactory;

public class DeviceProcess {

    public void doDay (Device device, AbstractFactoryService factory) {

        factory.createService().create(device);
        factory.doSmthService().doSmth(device);
        factory.messageService().sendMessage(device);

    }

}
