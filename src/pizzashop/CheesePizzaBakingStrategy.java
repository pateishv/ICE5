package pizzashop;

// Concrete implementation of BakingStrategy for CheesePizza
public class CheesePizzaBakingStrategy implements BakingStrategy {
    @Override
    public void bake() {
        // Assume specific baking steps for a cheese pizza
        System.out.println("Baking at 375°F for 12 minutes.");
        System.out.println("Checking internal temperature for doneness.");
        System.out.println("Pizza is ready!");
    }
}
