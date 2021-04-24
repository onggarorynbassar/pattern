package kz.onggar.pattern.factorymethod;

import kz.onggar.pattern.factorymethod.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new DodoPizzaFactory();
        Pizza pizza = factory.createPizza("First");
        System.out.println(pizza.getName());
        System.out.println(pizza.getCost());
        System.out.println(pizza.getRating());

        pizza = factory.createPizza("Second");
        System.out.println(pizza.getName());
        System.out.println(pizza.getCost());
        System.out.println(pizza.getRating());

        factory = new SushimanPizzaFactory();
        pizza = factory.createPizza("First");
        System.out.println(pizza.getName());
        System.out.println(pizza.getCost());
        System.out.println(pizza.getRating());

        pizza = factory.createPizza("Second");
        System.out.println(pizza.getName());
        System.out.println(pizza.getCost());
        System.out.println(pizza.getRating());
    }
}
