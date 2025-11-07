package Inheritance;
import java.util.*;

class NumberBase {
    protected List<Integer> numbers;  // protected → child classes can access

    public NumberBase(List<Integer> numbers) {
        this.numbers = new ArrayList<>(numbers);  // defensive copy
    }

    public void showList() {
        System.out.println("Numbers: " + numbers);
    }
}

// Child 1 → adds a number to the list
class AddNumbers extends NumberBase {
    public AddNumbers(List<Integer> numbers) {
        super(numbers);
    }

    public void add(int value) {
        numbers.add(value);
        System.out.println("Added: " + value);
    }
}

// Child 2 → sorts the list
class SortNumbers extends NumberBase {
    public SortNumbers(List<Integer> numbers) {
        super(numbers);
    }

    public void sortList() {
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
}

// Child 3 → filters only even numbers
class FilterEven extends NumberBase {
    public FilterEven(List<Integer> numbers) {
        super(numbers);
    }

    public List<Integer> getEvenNumbers() {
        List<Integer> evens = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) evens.add(n);
        }
        return evens;
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 3, 25, 8, 14);

        AddNumbers addObj = new AddNumbers(list);
        SortNumbers sortObj = new SortNumbers(list);
        FilterEven evenObj = new FilterEven(list);

        addObj.add(19);
        addObj.showList();

        sortObj.sortList();

        System.out.println("Even Numbers: " + evenObj.getEvenNumbers());
    }
}