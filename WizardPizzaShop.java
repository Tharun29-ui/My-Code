class MagicalPizza {

    String doughType;
    String cheeseMagic;
    String[] enchantedToppings;

    public MagicalPizza() {
        this.doughType = "Golden Crust";
        this.cheeseMagic = "Mystic Mozzarella";
        this.enchantedToppings = new String[0];
    }

    public MagicalPizza(String doughType, String cheeseMagic, String[] enchantedToppings) {
        this.doughType = doughType;
        this.cheeseMagic = cheeseMagic;
        this.enchantedToppings = enchantedToppings;
    }

    public void revealSpell() {
        System.out.println("A magical pizza with " + doughType + " dough, " + cheeseMagic + " cheese, and enchanted toppings: " + String.join(", ", enchantedToppings));
    }
}

public class WizardPizzaShop {
    public static void main(String[] args) {
        MagicalPizza spell1 = new MagicalPizza();
        spell1.revealSpell();

        String[] toppings1 = {"Dragon Peppers"};
        MagicalPizza spell2 = new MagicalPizza("Elven Bread", "Phoenix Cheese", toppings1);
        spell2.revealSpell();

        String[] toppings2 = {"Mystic Mushrooms", "Unicorn Olives"};
        MagicalPizza spell3 = new MagicalPizza("Dwarven Crust", "Wizard Cheddar", toppings2);
        spell3.revealSpell();
    }
}