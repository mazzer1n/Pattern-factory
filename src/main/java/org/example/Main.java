package org.example;

public class Main {
    public static void main(String[] args) {
        FactoryLights factoryLights = new CarsFactoryLights();
        factoryLights.createLights();
    }
}