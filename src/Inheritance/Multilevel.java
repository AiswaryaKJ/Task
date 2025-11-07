package Inheritance;
class Animal {
    private String species;        // private
    protected int age;             // protected
              String habitat;      // default
    public boolean isDomestic;     // public

    public Animal(String species, int age, boolean isDomestic, String habitat) {
        this.species = species;
        this.age = age;
        this.isDomestic = isDomestic;
        this.habitat = habitat;
    }

    protected void eat() {
        System.out.println("[Animal] Eating food...");
    }

    public String getSpecies() {
        return species; 
    }
}

class Dog extends Animal {
    protected String breed;   
    private int training;     

    public Dog(String sp, int age, boolean dom, String hab, String breed, int tr) {
        super(sp, age, dom, hab);
        this.breed = breed;
        this.training = tr;
    }

    @Override
    protected void eat() {
        super.eat();
        System.out.println("[Dog] Eating dog food...");
    }

    protected int getTraining() {
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
        p.eat();  // overridden chain
    }
}
