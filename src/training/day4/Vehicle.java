package training.day4;

public class Vehicle {

    final static double DEFAUL_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel_,int hp){
        fuelConsumption = DEFAUL_FUEL_CONSUMPTION;
        setFuel(fuel_);
        setHorsePower(hp);

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
}
