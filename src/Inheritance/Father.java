package Inheritance;

class son {
	void fname() {
	String name="Jon";
	System.out.println("Name:"+name);
}	}
public class Father extends son{
		
public static void main(String[] args) {
	Father s=new Father();
	s.fname();
}
}
