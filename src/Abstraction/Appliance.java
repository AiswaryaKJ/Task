package Abstraction;

public abstract class Appliance {
	abstract void turnOn();
	abstract void turnOff();
	abstract void setTimer(int x);
	void command() {
		System.out.println("All done");
	}

}
