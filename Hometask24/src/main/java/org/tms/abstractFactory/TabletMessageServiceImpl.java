package org.tms.abstractFactory;

public class TabletMessageServiceImpl implements MessageService{

    @Override
    public void sendMessage(Device device) {

        System.out.println("Send telegram message");

    }
}
