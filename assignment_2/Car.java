package assignment_2;

class Car extends Vehicle {
    int currentGear;

    Car(String name, int currentGear) {
        super(name);
        this.currentGear = currentGear;
    }

    void changeGear(int newGear) {
        currentGear = newGear;
    }

    void changeSpeed(double newSpeed, double newDirection) {
        move(newSpeed, newDirection);
    }
}