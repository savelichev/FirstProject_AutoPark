package ua.savelichev.autopark.cars;

import ua.savelichev.autopark.interfaces.GasolineCar;
import ua.savelichev.autopark.interfaces.Universal;


public class Octavia extends Car implements Universal, GasolineCar {

    public Octavia(){
        super("Skoda", "Oktavia", 8.5, 23340, 180);
    }

    public Octavia(double fuelConsumption, int cost, int maxSpeed) {
        super("Skoda", "Octavia", fuelConsumption, cost, maxSpeed);
    }

    @Override
    public void refill() {

    }

    @Override
    public void cargoTransportation() {

    }
}
