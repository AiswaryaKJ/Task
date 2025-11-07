package Collection;

import java.util.*;

class GroceryBasket {
    private List<String> basket = new ArrayList<>();

    public void addItem(String item) {
        basket.add(item);
        System.out.println(item + " added.");
    }

    public void removeItem(String item) {
        if (basket.remove(item))
            System.out.println(item + " removed.");
        else
            System.out.println(item + " not found.");
    }

    public void viewBasket() {
        System.out.println("Basket Items: " + basket);
    }

    public void sortBasket() {
        Collections.sort(basket);
        System.out.println("Sorted Basket: " + basket);
    }
}

public class GroceryDemo {
    public static void main(String[] args) {
        GroceryBasket g = new GroceryBasket();
        g.addItem("Milk");
        g.addItem("Banana");
        g.addItem("Rice");

        g.viewBasket();
        g.sortBasket();
        g.removeItem("Banana");
        g.viewBasket();
    }
}

