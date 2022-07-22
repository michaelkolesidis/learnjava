public class Bicycle {

    int cadence;
    int speed;
    int gear;

    // Constructor overloading 

    Bicycle() {
        cadence = 0;
        speed = 0;
        gear = 1;
    }

    Bicycle(int cadence_, int speed_, int gear_) {
        cadence = cadence_;
        speed = speed_;
        gear = gear_;
    }

    
    void changeCadence(int newValue) {
        cadence = newValue;
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
}
