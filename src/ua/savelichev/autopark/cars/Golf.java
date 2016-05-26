package ua.savelichev.autopark.cars;

import ua.savelichev.autopark.interfaces.GasolineCar;
import ua.savelichev.autopark.interfaces.Hatchback;


public class Golf extends Car implements Hatchback, GasolineCar{

    public Golf() {
        super("Volkswagen", "Golf", 7.1, 25000, 190);
    }

    public Golf(double fuelConsumption, int cost, int maxSpeed) {
        super("Volkswagen", "Golf", fuelConsumption, cost, maxSpeed);
    }

    @Override
    public void refill() {

    }

    @Override
    public void backLoading() {

    }
}
