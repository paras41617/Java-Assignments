package assignment_2;

interface WaterVehicle {
    String getVehicleName();

    int getVehicleCapacity();
}

// Boat class
class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return name;
    }

    public void setVehicleName(String name) {
        this.name = name;
    }

    public int getVehicleCapacity() {
        return this.capacity;
    }

    public void setVehicleCapacity(int capacity) {
        this.capacity = capacity;
    }

}