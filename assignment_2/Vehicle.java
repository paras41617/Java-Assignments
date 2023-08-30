package assignment_2;

class Vehicle {
    private String name;
    private double currentSpeed;
    private double currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void move(double speed, double direction) {
        currentSpeed = speed;
        currentDirection = direction;
    }

    public void steer(double direction) {
        currentDirection += direction;
    }

    public void stop() {
        currentSpeed = 0;
    }

    public String getName() {
        return name;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getCurrentDirection() {
        return currentDirection;
    }

    public void setName(String name) {
        this.name = name;
    }
}