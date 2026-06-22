package com.mru.IOC;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}


class ElectricEngine extends Engine {
    @Override
    void start() {
        System.out.println("Electric Engine Started");
    }
}

