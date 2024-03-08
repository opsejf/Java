package com.qa;

/**
 * One of the primary types of vehicle featuring in the company's vehicle fleet
 * All makes and models are catered for - no current restrictions
 * Fuel types Battery, Petrol and Diesel currently in usec
 * Updated 18/11/2022: JavaDoc comments added
 * @author Admin
 */
public class Car extends Vehicle implements IsDrivable, hasPassengers{

    private int wheels;
    private int passengers = 0;

    /**
     * Constructor for primary type of vehicle in the company's fleet
     * All parameters currently unrestricted - restrictions planned Q3 2023
     * Fuel types Petrol and Diesel may have limitations
     * Parameters:
     * make - Manufacturer of the car (eg. Toyota, Renault, BMW)
     * model - Car model name (eg. Prius, Megane, 2 Series Gran Coupe)
     * colour - The major colour of the vehicle (eg. Barley Gold, Cappuccino, Red)
     * fuelType - Source of power (eg. Battery, Petrol, Electric, Diesel, Hydrogen, Hybrid)
     * wheels - Number of wheels on the vehicle - generally 4, but 3 (eg. Nimbus) and 6 (Mercedes G63 AMG)
     * @param make      - Manufacturer of the car (eg. Toyota, Renault, BMW)
     * @param model     - Car model name (eg. Prius, Megane, 2 Series Gran Coupe)
     * @param colour    - The major colour of the vehicle (eg. Barley Gold, Cappuccino, Red)
     * @param fuelType  - Source of power (eg. Battery, Petrol, Electric, Diesel, Hydrogen, Hybrid)
     * @param wheels    - Number of wheels on the vehicle - generally 4, but 3 (eg. Nimbus) and 6 (Mercedes G63 AMG)
     */
    public Car(String make, String model, String colour, String fuelType, int wheels) {
        super(make, model, colour, fuelType);
        // TODO Auto-generated constructor stub
        this.wheels = wheels;
    }

    @Override
    public void accelerate() {
        this.setSpeed(this.getSpeed() + 10);

    }

    @Override
    public void brake() {
        this.setSpeed(this.getSpeed() - 10);

    }

    @Override

    /**
     * Used to alter the number of passengers accommodated by the car
     * @return void
     * @param passengers
     *
     */
    public void setPassengers(int passengers) {

        this.passengers = passengers;
    }

    @Override
    /**
     * Gives the number of passengers accommodated by the car
     */
    public int getPassengers() {

        return passengers;
    }


    public void cruiseAtSixty() {

        while(this.getSpeed() != 60) {
            if(this.getSpeed() < 60) {
                accelerate();
            }
            else {
                brake();
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; Passengers : " + passengers;
    }

    @Override
    public int getWheels() {
        // TODO Auto-generated method stub
        return wheels;
    }
}
