package assignment_2;

class F1 extends Car {
    F1(String name, int currentGear) {
        super(name, currentGear);
    }

    void accelerate(double rate) {
        currentSpeed += rate;
        if (currentSpeed <= 40) {
            currentGear = 1;
        } 
        else if (currentSpeed > 40 && currentSpeed <= 80){
            currentGear = 2;
        }
        else if (currentSpeed > 80 && currentSpeed <= 120){
            currentGear = 3;
        }
        else if (currentSpeed > 120 && currentSpeed <= 160){
            currentGear = 4;
        }
        else if (currentSpeed > 160 && currentSpeed <= 200){
            currentGear = 5;
        }
        else{
            currentGear = 6;
        }
    }
}