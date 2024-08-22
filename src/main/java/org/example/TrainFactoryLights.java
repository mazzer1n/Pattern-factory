package org.example;

public class TrainFactoryLights implements FactoryLights {
    @Override
    public Lights createLights() {
        return new TrainLights();
    }
}
