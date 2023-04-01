package com.comp301.a07pizza;

public class Sauce extends IngredientImpl{
  public static final Sauce TOMATO =  new Sauce("tomato", true, true);
  public static final Sauce BARBECUE =  new Sauce("barbecue", true, true);
  public static final Sauce PESTO =  new Sauce("pesto", true, true);
  public static final Sauce ALFREDO =  new Sauce("alfredo", true, false);
  public static final Sauce RANCH =  new Sauce("ranch", true, false);
  private Sauce(String name, boolean isVegetarian, boolean isVegan) {
    super(name, isVegetarian, isVegan);
  }
  public static Sauce create(String name) {
    switch (name) {
      case "tomato":
        return TOMATO;
      case "barbecue":
        return BARBECUE;
      case "pesto":
        return PESTO;
      case "alfredo":
        return ALFREDO;
      case "ranch":
        return RANCH;
      default:
        throw new IllegalArgumentException("Invalid Crust name: " + name);
    }
  }
}
