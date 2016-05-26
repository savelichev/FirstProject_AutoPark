package ua.savelichev.autopark.cars;


public abstract class Car {



    public Car(String producer, String model, double fuelConsumption, int cost, int maxSpeed) {
        this.producer = producer;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.maxSpeed = maxSpeed;
    }

    private String producer;

    private String model;

    private double fuelConsumption;

    private int cost;

    private int maxSpeed;



    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "{"+ producer +" "+  model  +
                ", Fuel Consumption=" + fuelConsumption +" L/100km"+
                ", Cost=" + cost +"$"+
                ", Max Speed=" + maxSpeed +"km/h"+
                '}'+"\n";
    }
}
