public class Car extends Vehicle{

    private final static double DEFAULT_FUEL_CONSUMPTION = 3;

    //if's underlined in red you can tab alt and enter and generate the constructor
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
