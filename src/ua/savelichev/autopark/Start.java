package ua.savelichev.autopark;

import ua.savelichev.autopark.Utils.AutoPark;
import ua.savelichev.autopark.Utils.AutoParkUtils;

/**
 * Created by savel_000 on 26.04.2016.
 */
public class Start {
    public static void main(String[] args) {

        AutoPark myAutoPark = new AutoPark();
        System.out.println(myAutoPark.getCars());

        AutoParkUtils.sortByFuelConsumption(myAutoPark.getCars());
        System.out.println("Cars sorted by fuel consamption: \n"
                +myAutoPark.getCars());

        System.out.println("Filter cars by hi speed: \n"
                +AutoParkUtils.filterCarsByHiSpeed(myAutoPark.getCars(),230));

        System.out.println("Total cost of autopark: \n"
                +AutoParkUtils.calcAutoParkCost(myAutoPark.getCars())+"$");
    }
}
