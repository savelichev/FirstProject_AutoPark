package ua.savelichev.autopark.cars;

import ua.savelichev.autopark.interfaces.GasolineCar;
import ua.savelichev.autopark.interfaces.Jeep;


public class Q7 extends Car implements Jeep, GasolineCar {
    @Override
    public void goOffroad() {

    }

    public Q7(){
        super("Audi", "Q7", 17.2, 49750, 220);
    }

    public Q7(double fuelConsumption, int cost, int maxSpeed) {
        super("Audi", "Q7", fuelConsumption, cost, maxSpeed);
    }

    @Override
    public void refill() {

    }
}
