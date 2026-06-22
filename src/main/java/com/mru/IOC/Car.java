package com.mru.IOC;

import org.springframework.beans.factory.annotation.Autowired;

class Car {

    @Autowired
    private Engine engine; // Car creates Engine
    ElectricEngine electricEngine;  // Car creates ElectricEngine

    void drive() {
        engine.start();
        System.out.println("Car Running");
    }
}

