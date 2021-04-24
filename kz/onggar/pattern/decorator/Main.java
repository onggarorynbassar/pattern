package kz.onggar.pattern.decorator;

import kz.onggar.pattern.decorator.beverage.Beverage;
import kz.onggar.pattern.decorator.beverage.HouseBlend;
import kz.onggar.pattern.decorator.decorator.*;

public class Main {

    public static void main(String[] args) {
        Beverage houseBlend = new Whip(new Milk(new Whip(new Milk(new Soy(new Soy(new Milk(new HouseBlend())))))));
        System.out.println(houseBlend.cost());
        System.out.println(houseBlend.getDescription());

        houseBlend = new BeverageDiscount(houseBlend, 0.2);

        System.out.println(houseBlend.cost());
        System.out.println(houseBlend.getDescription());

        houseBlend = new VAT(houseBlend, 0.12);

        System.out.println(houseBlend.cost());
        System.out.println(houseBlend.getDescription());
    }

}
