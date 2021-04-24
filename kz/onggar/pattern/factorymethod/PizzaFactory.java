package kz.onggar.pattern.factorymethod;

import kz.onggar.pattern.factorymethod.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String type);
}
