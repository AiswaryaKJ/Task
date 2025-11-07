package Abstraction;

abstract class Vehicle {
    protected String model;
    protected int batteryLevel;

    public Vehicle(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public void showBasicInfo() {
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    // abstract method → must be implemented by SmartCar
    public abstract void startEngine();
    public abstract void stopEngine();
}

// ---------------- SmartCar Class ----------------

class SmartCar extends Vehicle implements Navigable, Playable{

    public SmartCar(String model, int batteryLevel) {
        super(model, batteryLevel);
    }

    // Abstract method implementations
    @Override
    public void startEngine() {
        System.out.println("Engine started: Systems warming up...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped: Power saving mode enabled.");
    }

    // Navigable methods
    @Override
    public void startNavigation() {
        System.out.println("Navigation: Route calculated. Starting trip...");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Navigation stopped.");
    }

    // Playable methods
    @Override
    public void playMusic() {
        System.out.println("Playing music: Activating sound system...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }
}

public class SmartCarDemo {
    public static void main(String[] args) {

        SmartCar car = new SmartCar("Tesla Model A", 87);

        System.out.println("=== BASIC INFO ===");
        car.showBasicInfo();

        System.out.println("\n=== ENGINE ===");
        car.startEngine();
        car.stopEngine();

        System.out.println("\n=== NAVIGATION ===");
        car.startNavigation();
        car.stopNavigation();

        System.out.println("\n=== ENTERTAINMENT ===");
        car.playMusic();
        car.stopMusic();
    }
}

