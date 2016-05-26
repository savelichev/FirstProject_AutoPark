package ua.savelichev.autopark.cars;

import ua.savelichev.autopark.interfaces.ElectricCar;
import ua.savelichev.autopark.interfaces.Hatchback;



public class ModelS extends Car implements Hatchback, ElectricCar{

    public ModelS(){
        super("Tesla", "ModelS", 0, 35000, 180);
    }

    public ModelS(String producer, String model, double fuelConsumption, int cost, int maxSpeed) {
        super("Tesla", "ModelS", fuelConsumption, cost, maxSpeed);
    }

    @Override
    public void batteryCharging() {
        System.out.println("Battery is charging now!");
    }

    @Override
    public void backLoading() {

    }
}
