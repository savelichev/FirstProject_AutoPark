package ua.savelichev.autopark.cars;

import ua.savelichev.autopark.interfaces.GasolineCar;
import ua.savelichev.autopark.interfaces.Sedan;


public class Lanos extends Car implements Sedan, GasolineCar {
    @Override
    public void goFast() {

    }

    public Lanos(){
        super("Daewoo", "Lanos", 7.1, 7400, 170);
    }

    public Lanos(String producer, String model, double fuelConsumption, int cost, int maxSpeed) {
        super("Daewoo", "Lanos", fuelConsumption, cost, maxSpeed);
    }

    @Override
    public void refill() {

    }
}
