package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FoxService {

    private Map<String, Fox> foxes;

    public FoxService() {
        this.foxes = new HashMap<>();

        this.foxes.put("Vulpix", new Fox("Vulpix", Food.PIZZA, Drink.COLA));
        this.foxes.put("Vuk", new Fox("Vuk", Food.HAMBURGER, Drink.LEMONADE));
        this.foxes.put("Eevee", new Fox("Eevee", Food.GYROS, Drink.SPRITE));
        this.foxes.put("Mr.Green", new Fox("Mr. Green", Food.SALAD, Drink.WATER));
    }

    public Fox getFox(String name) {
        return foxes.get(name);

    }

    public Map<String, Fox> getFox() {
        return foxes;
    }

}
