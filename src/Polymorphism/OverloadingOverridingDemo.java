package Polymorphism;
class Calculation {

    int calculate(int a) {
        return a * a;   
    }
    int calculate(int a, int b) {
        return a + b;  
    }
   
    int calculate(int a, int b, int c) {
        return (a + b) - c;  
    }
}
class AdvancedCalculation extends Calculation {

    @Override
    int calculate(int a, int b) {
      
        int result = a * b;   
        return result;
    }
}
public class OverloadingOverridingDemo {

    public static void main(String[] args) {

        Calculation basic = new Calculation();
        AdvancedCalculation advanced = new AdvancedCalculation();

        System.out.println("Overloading Demo:");
        System.out.println("calculate(5)= " + basic.calculate(5));
        System.out.println("calculate(5, 3) = " + basic.calculate(5, 3));
        System.out.println("calculate(5, 3, 2) = " + basic.calculate(5, 3, 2));

        System.out.println("\nOverriding Demo:");
        System.out.println("Advanced calculate(5, 3)  = " + advanced.calculate(5, 3));
    }
}
