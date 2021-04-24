package kz.onggar.pattern.factorymethod;

import kz.onggar.pattern.factorymethod.pizza.FirstSushimanPizza;
import kz.onggar.pattern.factorymethod.pizza.Pizza;
import kz.onggar.pattern.factorymethod.pizza.SecondSushimanPizza;

public class SushimanPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("First")) {
            return new FirstSushimanPizza();
        } else if (type.equals("Second")) {
            return new SecondSushimanPizza();
        } else {
            throw new IllegalArgumentException();
        }
    }

}
