package org.example;

public class PedestrianFactoryLights implements FactoryLights{
    @Override
    public Lights createLights() {
        return new PedestrianLights();
    }
}
