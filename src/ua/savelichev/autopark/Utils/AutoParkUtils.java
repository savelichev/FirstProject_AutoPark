package ua.savelichev.autopark.Utils;


import ua.savelichev.autopark.cars.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AutoParkUtils {

    private AutoParkUtils(){}


    public static ArrayList<Car> filterCarsByHiSpeed(ArrayList<Car> cars, int maxSpeed) {
        ArrayList<Car> result = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= maxSpeed) {
                result.add(car);
            }
        }

        return result;
    }


    public static int calcAutoParkCost(ArrayList<Car> cars) {

        int cost = 0;

        for (Car car : cars) {
            cost = cost + car.getCost();
        }

        return cost;
    }

    public static ArrayList<Car> createCars() {

        ArrayList<Car> cars = new ArrayList<Car>();

        Car camry = new Camry();
        Car golf = new Golf();
        Car corolla = new Corolla();
        Car lanos = new Lanos();
        Car modelS = new ModelS();
        Car octavia = new Octavia();
        Car q7 = new Q7();
        Car x5 = new X5();

        cars.add(golf);
        cars.add(camry);
        cars.add(x5);
        cars.add(q7);
        cars.add(octavia);
        cars.add(lanos);
        cars.add(corolla);
        cars.add(modelS);

        return cars;
    }

    static Comparator<Car> fuelOrderer = new Comparator<Car>() {

        @Override
        public int compare(Car o1, Car o2) {

            return Double.compare(o1.getFuelConsumption(), o2.getFuelConsumption());
        }
    };

    public static ArrayList<Car> sortByFuelConsumption(ArrayList<Car> cars) {

        Collections.sort(cars, fuelOrderer);

        return cars;
    }
}
