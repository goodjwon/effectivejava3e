package effective.java.chapter2.item2.hierarchicalbuilder;

import static effective.java.chapter2.item2.hierarchicalbuilder.NyPizza.Size.*;
import static effective.java.chapter2.item2.hierarchicalbuilder.Pizza.Topping.*;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
