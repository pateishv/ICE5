/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 * @author dancye
 */
public abstract class Pizza {
    private ArrayList<String> toppings = new ArrayList<>();
    private BakingStrategy bakingStrategy;

    public Pizza(BakingStrategy bakingStrategy) {
        this.bakingStrategy = bakingStrategy;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void bake() {
        bakingStrategy.bake();
    }
}