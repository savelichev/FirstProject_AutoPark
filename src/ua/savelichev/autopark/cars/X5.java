package ua.savelichev.autopark.cars;

import ua.savelichev.autopark.interfaces.GasolineCar;
import ua.savelichev.autopark.interfaces.Jeep;


public class X5 extends Car implements Jeep, GasolineCar {


    public X5() {
        super("BMW", "X5", 18.3, 54250, 250);
    }

    /*
    * If car is not new, it means that parameters differ than
    * basic.
    **/
    public X5(double fuelConsumption, int cost, int maxSpeed) {
        super("BMW", "X5", fuelConsumption, cost, maxSpeed);
    }

    @Override
    public void refill() {

    }

    @Override
    public void goOffroad() {

    }
}