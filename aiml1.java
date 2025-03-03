public class aiml1 {
    String crust;
     String toppings;
     boolean isGlutenFree;
     boolean hasExtraCheese;
     boolean hasOlives;
     boolean hasOnions;
     public aiml1()
     {
        this.crust = "Regular Crust";
        this.toppings = "None";
        this.isGlutenFree = false;
        this.hasExtraCheese = false;
        this.hasOlives = false;
        this.hasOnions = true;
     }
     public aiml1(boolean extraCheese, boolean olives) {
        this();
        this.hasExtraCheese = extraCheese;
        this.hasOlives = olives;
    }

    public aiml1(boolean glutenFree, boolean extraCheese, boolean noOnions) {
        this(extraCheese, false);  
        this.isGlutenFree = glutenFree;
        this.hasOnions = !noOnions;
    }

    public void displayOrder() {
        System.out.println("Pizza Order:");
        System.out.println("Crust: " + crust);
        System.out.println("Toppings: " + (hasOlives ? "Olives, " : "") + (hasExtraCheese ? "Extra Cheese, " : "") + (hasOnions ? "Onions" : "No Onions"));
        System.out.println("Gluten-Free Crust: " + (isGlutenFree ? "Yes" : "No"));
        System.out.println();
    }
}


