package org.tms.abstractFactory;

public class PhoneAbstractFactoryServiceImpl implements AbstractFactoryService{

    @Override
    public CreateService createService() {
        return new PhoneCreateServiceImpl();
    }

    @Override
    public DoSmthService doSmthService() {
        return new PhoneDoSmthServiceImpl();
    }

    @Override
    public MessageService messageService() {
        return new PhoneMessageServiceImpl();
    }
}
