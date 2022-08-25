package com.absa.africa.droolsdemo.util;

public class Helpers {

    public String generateCode() {

        long randomNumber = (long) (Math.random()*Math.pow(10,10));
        return String.valueOf(randomNumber);
    }
}
