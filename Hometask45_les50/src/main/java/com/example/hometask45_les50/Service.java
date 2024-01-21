package com.example.hometask45_les50;

public class Service {

    public int findSubstringIndex (String string, String substring){

        if(string.contains(substring)) {
            return string.indexOf(substring);
        }
        return -1;
    }

}
