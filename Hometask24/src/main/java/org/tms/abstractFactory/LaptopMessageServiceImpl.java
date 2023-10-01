package org.tms.abstractFactory;

public class LaptopMessageServiceImpl implements MessageService{

    @Override
    public void sendMessage(Device device) {

        System.out.println("Send email");

    }
}
