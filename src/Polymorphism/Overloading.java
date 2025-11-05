package Polymorphism;

public class Overloading {
	Overloading(){
		System.out.println("1");
	}
	Overloading(int y){
		System.out.println(y);
	}
	void add(int a,int b){
		System.out.println("Two num:"+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("Three num:"+(a+b+c));
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		Overloading ol=new Overloading(8);
		o.add(1, 2);
		o.add(1, 2, 3);
	}

}
