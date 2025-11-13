package Inheritance;
class Animal {
    String species;        
    int age;             
    String habitat;     
    boolean isDomestic;     

    public Animal(String species, int age, boolean isDomestic, String habitat) {
        this.species = species;
        this.age = age;
        this.isDomestic = isDomestic;
        this.habitat = habitat;
    }

    void eat() {
        System.out.println("[Animal] Eating food...");
    }

    String getSpecies() {
        return species; 
    }
}

class Dog extends Animal {
    String breed;   
    int training;     

    public Dog(String sp, int age, boolean dom, String hab, String breed, int tr) {
        super(sp, age, dom, hab);
        this.breed = breed;
        this.training = tr;
    }

    @Override
   void eat() {
        super.eat();
        System.out.println("[Dog] Eating dog food...");
    }

   int getTraining() {
        return training;
    }
}

class Puppy extends Dog {
    public Puppy(String sp, int age, boolean dom, String hab, String br, int tr) {
        super(sp, age, dom, hab, br, tr);
    }

    @Override
    protected void eat() {
        super.eat();
        System.out.println("[Puppy] Drinking milk...");
    }

    public void showDetails() {
        System.out.println("Species: " + getSpecies());
        System.out.println("Age: " + age);
        System.out.println("Habitat: " + habitat);
        System.out.println("Domestic: " + isDomestic);
        System.out.println("Breed: " + breed);
        System.out.println("Training Level: " + getTraining());
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy("Canine", 1, true, "Home", "Labrador", 3);
        p.showDetails();
        System.out.println();
        p.eat(); 
    }
}
