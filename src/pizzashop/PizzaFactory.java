/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class that creates different kinds of pizzas
 * depending on their type.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */
// Updated PizzaFactory to use Strategy Pattern
public class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        BakingStrategy bakingStrategy;

        if (type.equals("cheese")) {
            bakingStrategy = new CheesePizzaBakingStrategy();
            pizza = new CheesePizza(bakingStrategy);
        } else if (type.equals("pepperoni")) {
            bakingStrategy = new PepperoniPizzaBakingStrategy();
            pizza = new PepperoniPizza(bakingStrategy);
        }

        return pizza;
    }
}
