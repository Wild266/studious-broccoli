package com.comp301.a07pizza;

public class Topping extends IngredientImpl{
  private static final Topping TOMATO = new Topping("tomato", true, true);
  private static final Topping GARLIC = new Topping("garlic", true, true);
  private static final Topping MUSHROOMS = new Topping("mushrooms", true, true);
  private static final Topping PINEAPPLE = new Topping("pineapple", true, true);
  private static final Topping OLIVES = new Topping("olives", true, true);
  private static final Topping GREEN_PEPPER = new Topping("green pepper", true, true);
  private static final Topping SPINACH = new Topping("spinach", true, true);
  private static final Topping ONION = new Topping("onion", true, true);
  private static final Topping JALAPENO = new Topping("jalapeno", true, true);
  private static final Topping SUN_DRIED_TOMATO = new Topping("sun-dried tomato", true, true);
  private static final Topping PEPPERONI = new Topping("pepperoni", false, false);
  private static final Topping GROUND_BEEF = new Topping("ground beef", false, false);
  private static final Topping SAUSAGE = new Topping("sausage", false, false);
  private static final Topping BACON = new Topping("bacon", false, false);
  private static final Topping BUFFALO_CHICKEN = new Topping("buffalo chicken", false, false);
  private static final Topping HAM = new Topping("ham", false, false);
  private static final Topping ANCHOVIES = new Topping("anchovies", false, false);

  private Topping(String name, boolean isVegetarian, boolean isVegan) {
    super(name, isVegetarian, isVegan);
  }
  public static Topping create(String name) {
    switch (name) {
      case "tomato":
        return TOMATO;
      case "garlic":
        return GARLIC;
      case "mushrooms":
        return MUSHROOMS;
      case "pineapple":
        return PINEAPPLE;
      case "olives":
        return OLIVES;
      case "green pepper":
        return GREEN_PEPPER;
      case "spinach":
        return SPINACH;
      case "onion":
        return ONION;
      case "jalapeno":
        return JALAPENO;
      case "sun-dried tomato":
        return SUN_DRIED_TOMATO;
      case "pepperoni":
        return PEPPERONI;
      case "ground beef":
        return GROUND_BEEF;
      case "sausage":
        return SAUSAGE;
      case "bacon":
        return BACON;
      case "buffalo chicken":
        return BUFFALO_CHICKEN;
      case "ham":
        return HAM;
      case "anchovies":
        return ANCHOVIES;
      default:
        throw new IllegalArgumentException("Invalid topping name: " + name);
    }
  }
}
