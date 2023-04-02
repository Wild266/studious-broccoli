package com.comp301.a07pizza;

public class Crust extends IngredientImpl {
  public static final Crust HAND_TOSSED = new Crust("hand-tossed", true, true);
  public static final Crust THIN = new Crust("thin", true, true);
  public static final Crust DEEP_DISH = new Crust("deep dish", true, true);

  private Crust(String name, boolean isVegetarian, boolean isVegan) {
    super(name, isVegetarian, isVegan);
  }

  public static Crust create(String name) {
    switch (name) {
      case "hand-tossed":
        return HAND_TOSSED;
      case "thin":
        return THIN;
      case "deep-dish":
        return DEEP_DISH;
      default:
        throw new IllegalArgumentException("Invalid Crust name: " + name);
    }
  }
}
