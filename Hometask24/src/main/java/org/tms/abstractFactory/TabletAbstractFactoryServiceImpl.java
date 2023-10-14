package org.tms.abstractFactory;

public class TabletAbstractFactoryServiceImpl implements AbstractFactoryService{

    @Override
    public CreateService createService() {
        return new TabletCreateServiceImpl();
    }

    @Override
    public DoSmthService doSmthService() {
        return new TabletDoSmthServiceImpl();
    }

    @Override
    public MessageService messageService() {
        return new TabletMessageServiceImpl();
    }
}
