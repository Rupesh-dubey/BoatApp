package com.example.boatapp;

public class BoatStatus {
    private int fuelLevel;
    private float engineTemperature;
    private float speed;

    public BoatStatus(int fuelLevel, float engineTemperature, float speed) {
        this.fuelLevel = fuelLevel;
        this.engineTemperature = engineTemperature;
        this.speed = speed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public float getEngineTemperature() {
        return engineTemperature;
    }

    public float getSpeed() {
        return speed;
    }
}
