package ua.savelichev.autopark.cars;

import ua.savelichev.autopark.interfaces.GasolineCar;
import ua.savelichev.autopark.interfaces.Sedan;


public class Camry extends Car implements Sedan, GasolineCar {

    public Camry(){
        super("Toyota", "Camry", 7.8, 28940, 210);
    }

    public Camry(double fuelConsumption, int cost, int maxSpeed) {
        super("Toyota", "Camry", fuelConsumption, cost, maxSpeed);
    }

    @Override
    public void refill() {

    }

    @Override
    public void goFast() {

    }
}
