package Abstraction;

class SmartFan extends Appliance{

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Fan On");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Fan Off");
	}

	@Override
	void setTimer(int x) {
		// TODO Auto-generated method stub
		System.out.println("Timer Set(Fan)"+x+"Minutes");
	}
	
}

class SmartLight extends Appliance{

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Light On");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Light Off");
	}

	@Override
	void setTimer(int x) {
		// TODO Auto-generated method stub
		System.out.println("Timer Set(Light)"+x+"Minutes");
	}
	
}
class SmartAC extends Appliance{

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("AC On");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("AC Off");
	}

	@Override
	void setTimer(int x) {
		// TODO Auto-generated method stub
		System.out.println("Timer Set(AC)"+x+" Minutes");
	}
	
}
public class UserAppliance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SmartFan sf=new SmartFan();
	SmartLight sl=new SmartLight();
	SmartAC sa=new SmartAC();
	sf.turnOn();
	sa.setTimer(10);
	
	}

}
