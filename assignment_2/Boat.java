package assignment_2;

interface WaterVehicle {
    String getVehicleName();

    int getVehicleCapacity();
}

class Boat implements WaterVehicle {
    String name;
    int capacity;

    Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}
