package org.tms.abstractFactory;

public interface AbstractFactoryService {

    CreateService createService();

    DoSmthService doSmthService();

    MessageService messageService();

}
