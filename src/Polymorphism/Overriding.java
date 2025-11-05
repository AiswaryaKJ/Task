package Polymorphism;

class Animal{
	void eat() {
		System.out.println("Animal eats!!");
	}
}
class Dog extends Animal {
	
	void eat() {
		super.eat();
		System.out.println("Dog eats!!");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
	}

}
