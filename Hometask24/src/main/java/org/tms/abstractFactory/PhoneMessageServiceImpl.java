package org.tms.abstractFactory;

public class PhoneMessageServiceImpl implements MessageService{

    @Override
    public void sendMessage(Device device) {

        System.out.println("Send viber message");

    }
}
