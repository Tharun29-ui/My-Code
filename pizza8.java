class Pizza {
    String crust;
    String cheese;
    String[] toppings;

    public Pizza() {
        this.crust = "regular";
        this.cheese = "standard";
        this.toppings = new String[0];
    }

    public Pizza(String crust, String cheese, String[] toppings) {
        this.crust = crust;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    public void displayPizza() {
        System.out.println("Pizza with " + crust + " crust, " + cheese + " cheese, and " + String.join(", ", toppings));
    }
}

public class pizza8 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.displayPizza();

        String[] toppings1 = {"olives"};
        Pizza pizza2 = new Pizza("regular", "extra", toppings1);
        pizza2.displayPizza();

        String[] toppings2 = {"olives"};
        Pizza pizza3 = new Pizza("gluten-free", "extra", toppings2);
        pizza3.displayPizza();
    }
}
