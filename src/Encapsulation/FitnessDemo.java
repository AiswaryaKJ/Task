package Encapsulation;

class FitnessTracker {
    private int steps;
    private int calories;
    private int heartRate;

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
       this.steps = steps;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories >= 0) this.calories = calories;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
         this.heartRate = heartRate;
    }

    public void updateSteps(int count) {
        setSteps(steps + count);
    }

    public void logWorkout(int burnt, int hr) {
        setCalories(calories + burnt);
        setHeartRate(hr);
    }

    public void showStats() {
        System.out.println("Steps: " + steps +
                           ", Calories: " + calories +
                           ", Heart Rate: " + heartRate);
    }
}

public class FitnessDemo {
    public static void main(String[] args) {
        FitnessTracker t = new FitnessTracker();
        t.updateSteps(1200);
        t.logWorkout(300, 110);
        t.showStats();
    }
}
