package Inheritance;
class Father {
    String name;
    int age;

    Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showFatherDetails() {
        System.out.println("Father Name : " + name);
        System.out.println("Father Age  : " + age);
    }
}

class Son extends Father {
    String schoolName;

    Son(String name, int age, String schoolName) {
        super(name, age);         
        this.schoolName = schoolName;
    }

    void showSonDetails() {
        System.out.println("Son studies in : " + schoolName);
    }
}

public class Singlelevel {
    public static void main(String[] args) {

        Son s = new Son("Raman", 45, "St. Joseph Public School");

        s.showFatherDetails();    // accessing parent class method
        s.showSonDetails();       // child class method
    }
}
