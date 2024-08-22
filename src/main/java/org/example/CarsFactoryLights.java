package org.example;

public class CarsFactoryLights implements FactoryLights{
    @Override
    public Lights createLights() {
        return new CarsLights();
    }
}
