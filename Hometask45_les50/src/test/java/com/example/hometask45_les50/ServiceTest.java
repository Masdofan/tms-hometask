package com.example.hometask45_les50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ServiceTest {
    @Test
    public void testIndexFinder() {

        Service service = new Service();

        String string = "Hello World";
        String substring = " ";

        int substringIndex = service.findSubstringIndex(string, substring);

        Assertions.assertEquals(5, substringIndex);

    }

}

