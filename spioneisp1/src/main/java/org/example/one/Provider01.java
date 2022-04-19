package org.example.one;

import org.example.SPIFirst;

public class Provider01 implements SPIFirst {
    @Override
    public String name(String s) {
        System.out.println("hello, this is " + s);
        return "Provider01";
    }
}
