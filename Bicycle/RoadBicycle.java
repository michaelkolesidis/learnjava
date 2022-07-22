public class RoadBicycle implements Bicycle {

    int cadence;
    int speed;
    int gear;

    // Constructor overloading

    RoadBicycle() {
        cadence = 0;
        speed = 0;
        gear = 1;
    }

    RoadBicycle(int cadence_, int speed_, int gear_) {
        cadence = cadence_;
        speed = speed_;
        gear = gear_;
    }

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
