package pizzashop;

// Concrete implementation of BakingStrategy for PepperoniPizza
public class PepperoniPizzaBakingStrategy implements BakingStrategy {
    @Override
    public void bake() {
        // Assume specific baking steps for a pepperoni pizza
        System.out.println("Baking at 400°F for 15 minutes.");
        System.out.println("Adding extra pepperoni slices.");
        System.out.println("Checking internal temperature for doneness.");
        System.out.println("Pizza is ready!");
    }
}
