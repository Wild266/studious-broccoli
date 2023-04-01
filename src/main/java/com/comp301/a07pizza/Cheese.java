package com.comp301.a07pizza;

public class Cheese extends IngredientImpl{
  public static final Cheese MOZZARELLA =  new Cheese("mozzarella", true, false);
  public static final Cheese BLEND =  new Cheese("blend", true, false);
  public static final Cheese VEGAN =  new Cheese("vegan", true, true);
  private Cheese(String name, boolean isVegetarian, boolean isVegan) {
    super(name, isVegetarian, isVegan);
  }
  public static Cheese create(String name) {
    switch (name) {
      case "mozzarella":
        return MOZZARELLA;
      case "blend":
        return BLEND;
      case "vegan":
        return VEGAN;
      default:
        throw new IllegalArgumentException("Invalid Crust name: " + name);
    }
  }
}
