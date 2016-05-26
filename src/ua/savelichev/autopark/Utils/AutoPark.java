package ua.savelichev.autopark.Utils;

import ua.savelichev.autopark.cars.Car;

import java.util.ArrayList;

/**
 * Created by savel_000 on 05.05.2016.
 */
public class AutoPark {

    ArrayList<Car> cars;


    public AutoPark(){

        cars =AutoParkUtils.createCars();

    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
