package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NutritionService {

  private List<Food> foodList;
  private List<Drink> drinkList;

  public List<Food> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<Food> foodList) {
    this.foodList = foodList;
  }

  public List<Drink> getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(List<Drink> drinkList) {
    this.drinkList = drinkList;
  }

  public NutritionService() {
    foodList = new ArrayList<Food>();
    drinkList = new ArrayList<Drink>();
  }
}
