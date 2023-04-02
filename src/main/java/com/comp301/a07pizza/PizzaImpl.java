package com.comp301.a07pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaImpl implements Pizza{
  private static Pizza.Size size = null;
  private static Crust crust = null;
  private static Sauce sauce = null;
  private static Cheese cheese = null;
  private static List<Ingredient> topping = new ArrayList<Ingredient>();
  private static List<Ingredient> allingredients = new ArrayList<Ingredient>();

  public PizzaImpl(Pizza.Size size, Crust crust, Sauce sauce, Cheese cheese, List<Ingredient> topping){
    PizzaImpl.size = size;
    PizzaImpl.crust = crust;
    PizzaImpl.sauce = sauce;
    PizzaImpl.cheese = cheese;
    PizzaImpl.topping = topping;
    allingredients.add(crust);
    allingredients.add(sauce);
    allingredients.add(cheese);
    allingredients.addAll(topping);
  }
  @Override
  public boolean isVegetarian() {
    for (Ingredient i: allingredients){
      if (!i.isVegetarian()){
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean isVegan() {
    for (Ingredient i: allingredients){
      if (!i.isVegan()){
        return false;
      }
    }
    return true;
  }

  @Override
  public double getPrice() {
    if (size==Size.SMALL){
      return 7 + 0.25*topping.size();
    } else if (size == Size.MEDIUM){
      return 9 + .5* topping.size();
    } else {
      return 11 + .75* topping.size();
    }
  }

  @Override
  public Size getSize() {
    return size;
  }

  @Override
  public Ingredient getSauce() {
    return sauce;
  }

  @Override
  public Ingredient getCheese() {
    return cheese;
  }

  @Override
  public Ingredient getCrust() {
    return crust;
  }

  @Override
  public Ingredient[] getToppings() {
    return topping.toArray(new Ingredient[0]);
  }

  @Override
  public Ingredient[] getIngredients() {
    return allingredients.toArray(new Ingredient[0]);
  }
}
