package org.tms.abstractFactory;

public class LaptopAbstractFactoryServiceImpl implements AbstractFactoryService{

    @Override
    public CreateService createService() {
        return new LaptopCreateServiceImpl();
    }

    @Override
    public DoSmthService doSmthService() {
        return new LaptopDoSmthServiceImpl();
    }

    @Override
    public MessageService messageService() {
        return new LaptopMessageServiceImpl();
    }
}
