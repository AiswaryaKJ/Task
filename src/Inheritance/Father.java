package Inheritance;

class son {
	String name="Jon";
	void fname() {
	
	System.out.println("Name:"+name);
}	}
public class Father extends son{
		
public static void main(String[] args) {
	Father s=new Father();
	s.fname();
}
}
