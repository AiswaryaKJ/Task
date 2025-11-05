package Inheritance;

class Animal {
	    void eat() {
	        System.out.println("This animal eats food.");
	    }
	}

class Dog extends Animal {
	    void bark() {
	        System.out.println("The dog barks.");
	    }
	}

	
class Puppy extends Dog {
	    void weep() {
	        System.out.println("The puppy weeps.");
	    }
	}

	
	public class Multilevel
	{
	    public static void main(String[] args) {
	        Puppy myPuppy = new Puppy();

	       
	        myPuppy.eat();     
	        myPuppy.bark();    
	        myPuppy.weep();    
	    }
	
}
