package com.comp301.a07pizza;

import java.util.ArrayList;

public class PizzaFactory {

  public static Pizza makeCheesePizza(Pizza.Size size) {
    return new PizzaImpl(
        size,
        Crust.create("hand-tossed"),
        Sauce.create("tomato"),
        Cheese.create("blend"),
        new ArrayList<Topping>());
  }

  public static Pizza makeHawaiianPizza(Pizza.Size size) {
    ArrayList<Topping> tps = new ArrayList<Topping>();
    tps.add(Topping.create("ham"));
    tps.add(Topping.create("pineapple"));
    return new PizzaImpl(
        size, Crust.create("hand-tossed"), Sauce.create("tomato"), Cheese.create("blend"), tps);
  }

  public static Pizza makeMeatLoversPizza(Pizza.Size size) {
    ArrayList<Topping> tps = new ArrayList<Topping>();
    tps.add(Topping.create("pepperoni"));
    tps.add(Topping.create("sausage"));
    tps.add(Topping.create("bacon"));
    tps.add(Topping.create("ground beef"));
    return new PizzaImpl(
        size, Crust.create("deep-dish"), Sauce.create("tomato"), Cheese.create("blend"), tps);
  }

  public static Pizza makeVeggieSupremePizza(Pizza.Size size) {
    ArrayList<Topping> tps = new ArrayList<Topping>();
    tps.add(Topping.create("sun-dried tomato"));
    tps.add(Topping.create("green pepper"));
    tps.add(Topping.create("mushrooms"));
    tps.add(Topping.create("olives"));
    return new PizzaImpl(
        size, Crust.create("thin"), Sauce.create("tomato"), Cheese.create("blend"), tps);
  }

  public static Pizza makeDailySpecialPizza() {
    ArrayList<Topping> tps = new ArrayList<Topping>();
    tps.add(Topping.create("sun-dried tomato"));
    tps.add(Topping.create("green pepper"));
    tps.add(Topping.create("mushrooms"));
    tps.add(Topping.create("olives"));
    return new PizzaImpl(
        Pizza.Size.LARGE,
        Crust.create("thin"),
        Sauce.create("tomato"),
        Cheese.create("blend"),
        tps);
  }
}
