package assignment_2;

class F1 extends Car {
    public F1(String name, int currentGear) {
        super(name, currentGear);
    }

    public void accelerate(double rate) {
        double currentSpeed = getCurrentSpeed();
        currentSpeed += rate;
        if (currentSpeed <= 40) {
            changeGear(1);
        } else if (currentSpeed > 40 && currentSpeed <= 80) {
            changeGear(2);
        } else if (currentSpeed > 80 && currentSpeed <= 120) {
            changeGear(3);
        } else if (currentSpeed > 120 && currentSpeed <= 160) {
            changeGear(4);
        } else if (currentSpeed > 160 && currentSpeed <= 200) {
            changeGear(5);
        } else if (currentSpeed > 200) {
            changeGear(6);
        } else {
            changeGear(1);
        }
        move(currentSpeed, getCurrentDirection());
    }
}
