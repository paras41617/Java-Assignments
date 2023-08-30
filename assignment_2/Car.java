package assignment_2;

class Car extends Vehicle {
    private int currentGear;

    public Car(String name, int currentGear) {
        super(name);
        this.currentGear = currentGear;
    }

    public void changeGear(int newGear) {
        currentGear = newGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeSpeed(double newSpeed, double newDirection) {
        move(newSpeed, newDirection);
    }
}