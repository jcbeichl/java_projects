/*
 * Bicycle Demo
 * James Beichler
 * PRG/421
 * 1/21/2019
 */
package bicycledemo;

public class BicycleDemo {

    public static void main(String[] args) {
// Create two instances each of MountainBike and RoadBike.
        Bicycle bike1 = new Bicycle.MountainBike();
        Bicycle bike2 = new Bicycle.RoadBike();
         
        // Invoke methods on those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        System.out.println("Bike: " + bike1.getbicycleCount());
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        System.out.println("Bike: " + bike2.getbicycleCount());
        bike2.printStates();
    }
}
// Change the Bicycle class to be an abstract class.
abstract class Bicycle {
    /* Add a private variable of type integer named bicycleCount, and initialize
    this variable to 0.*/
    private static int bicycleCount=0;
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    /* Change the Bicycle constructor to add 1 to the bicycleCount each time a
    new object of type Bicycle is created. */
    Bicycle() {
        bicycleCount=1;
    }



    // Add a public getter method to return the current value of bicycleCount.
    public int getbicycleCount() {
        return bicycleCount++;
    }

    void changeCadence(int newCadence) {
        cadence = newCadence;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

    /* Derive two classes from Bicycle: MountainBike and RoadBike. To the
MountainBike class, add the private variables tireTread (String) and
mountainRating (int). To the RoadBike class, add the private variable
maximumMPH (int). */
    static class MountainBike extends Bicycle {
        private String tireTread;
        private int mountainRating;
    }
    static class RoadBike extends Bicycle {
        private int maximumMPH;
    }
    }
    
