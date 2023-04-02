package com.comp301.a07pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaImpl implements Pizza{
  private static Pizza.Size size = null;
  private static Crust crust = null;
  private static Sauce sauce = null;
  private static Cheese cheese = null;
  private static List<Topping> topping = new ArrayList<Topping>();
  private List<Ingredient> allingredients = new ArrayList<Ingredient>();

  public PizzaImpl(Pizza.Size size, Crust crust, Sauce sauce, Cheese cheese, List<Topping> topping){
    PizzaImpl.size = size;
    PizzaImpl.crust = crust;
    PizzaImpl.sauce = sauce;
    PizzaImpl.cheese = cheese;
    PizzaImpl.topping = topping;
    this.allingredients.add(crust);
    this.allingredients.add(sauce);
    this.allingredients.add(cheese);
    this.allingredients.addAll(topping);
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
    return topping.toArray(new Ingredient[topping.size()]);
  }

  @Override
  public Ingredient[] getIngredients() {
//    for (Ingredient i : allingredients){
//      System.out.println(i.getName());
//    }
    return allingredients.toArray(new Ingredient[allingredients.size()]);
  }
}
