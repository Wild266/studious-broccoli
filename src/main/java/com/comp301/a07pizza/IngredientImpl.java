package com.comp301.a07pizza;

public class IngredientImpl implements Ingredient{
  private String name;
  private boolean isVegetarian;
  private boolean isVegan;
  public IngredientImpl (String name, boolean isVegetarian, boolean isVegan){
    this.name = name;
    this.isVegetarian = isVegetarian;
    this.isVegan = isVegan;
  }
  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean isVegetarian() {
    return isVegetarian;
  }

  @Override
  public boolean isVegan() {
    return isVegan;
  }
}
