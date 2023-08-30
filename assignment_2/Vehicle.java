package assignment_2;

class Vehicle {
    String name;
    double currentSpeed;
    double currentDirection;

    Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    void move(double speed, double direction) {
        currentSpeed = speed;
        currentDirection = direction;
    }

    void steer(double direction) {
        currentDirection += direction;
    }

    void stop() {
        currentSpeed = 0;
    }
}