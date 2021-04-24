package kz.onggar.pattern.factorymethod;

import kz.onggar.pattern.factorymethod.pizza.FirstDodoPizza;
import kz.onggar.pattern.factorymethod.pizza.Pizza;
import kz.onggar.pattern.factorymethod.pizza.SecondDodoPizza;

public class DodoPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("First")){
            return new FirstDodoPizza();
        }else if(type.equals("Second")){
            return new SecondDodoPizza();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
