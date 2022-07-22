/*
 * Bicycle Demo
 * 
 * A simple example of object-oriented programming
 * 
 */

class BicycleDemo {

    public static void main(String[] args) {

        // Create two different
        // Bicycle objects
        Bicycle roadBike1 = new RoadBicycle();
        Bicycle roadBike2 = new RoadBicycle(5, 40, 2);

        // Invoke methods on
        // those objects
        roadBike1.changeCadence(50);
        roadBike1.speedUp(10);
        roadBike1.changeGear(2);
        roadBike1.printStates();

        roadBike2.changeCadence(50);
        roadBike2.speedUp(10);
        roadBike2.changeGear(2);
        roadBike2.changeCadence(40);
        roadBike2.speedUp(10);
        roadBike2.changeGear(3);
        roadBike2.printStates();

    }
}
