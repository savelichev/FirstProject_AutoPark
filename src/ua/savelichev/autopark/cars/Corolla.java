package ua.savelichev.autopark.cars;

import ua.savelichev.autopark.interfaces.GasolineCar;
import ua.savelichev.autopark.interfaces.Hatchback;


public class Corolla extends Car implements Hatchback,GasolineCar {

    public Corolla() {
        super("Toyota", "Corolla", 7.5, 16540, 170);
    }

    /*
    * If car is not new, it means that parameters differ than
    * basic.
    */
    public Corolla(double fuelConsumption, int cost, int maxSpeed) {
        super("Toyota", "Corolla", fuelConsumption, cost, maxSpeed);
    }

    @Override
    public void refill() {

    }

    @Override
    public void backLoading() {

    }
}
