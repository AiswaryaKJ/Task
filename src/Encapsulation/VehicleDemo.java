package Encapsulation;
class SpeedMonitor {
    private int currentSpeed;
    private int maxSpeed = 120;    

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
            if (currentSpeed > maxSpeed) currentSpeed = maxSpeed; 
        }
    }

    private void updateSpeed(int newSpeed) {
        if (newSpeed >= 0) currentSpeed = newSpeed;
    }

    public void accelerate(int value) {
        if (value <= 0) return;
        int newSpeed = currentSpeed + value;
        if (newSpeed <= maxSpeed) updateSpeed(newSpeed);
        else System.out.println("Cannot exceed max speed!");
    }

    public void brake(int value) {
        if (value <= 0) return;
        int newSpeed = currentSpeed - value;
        updateSpeed(Math.max(0, newSpeed));
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        SpeedMonitor car = new SpeedMonitor();
        car.accelerate(50);
        car.accelerate(100); 
        car.brake(20);
        car.setMaxSpeed(80);  
        System.out.println("Current Speed: " + car.getCurrentSpeed());
        System.out.println("Max Speed: " + car.getMaxSpeed());
    }
}
