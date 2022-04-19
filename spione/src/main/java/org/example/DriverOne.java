package org.example;

import java.util.ServiceLoader;

public class DriverOne {
    public static SPIFirst first;
    static {
        ServiceLoader<SPIFirst> load = ServiceLoader.load(SPIFirst.class);
        int count = 0;
        for (SPIFirst spiFirst : load) {
            // 查找第一个
            count++;
            first = spiFirst;
            break;
        }
        if(count == 0) {
            throw new RuntimeException("你需要加载一个spi 容器： org.example.SPIFirst");
        }
        
    }

    public String say(String sayName) {
        return first.name(sayName);
    }
}
