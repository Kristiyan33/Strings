package training.day4;

public class Vehicle {

    final private double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel,int hp) {
        fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
        this.fuel = fuel;
        this.horsePower = hp;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void drive(int distance) {
        if (fuel <=0) {
            throw new IllegalArgumentException("Not enough fuel to start the trip.");
        }
        else{
            fuel = fuel -(fuelConsumption*(distance/100));
            System.out.println(fuel);
        }
    }
}
