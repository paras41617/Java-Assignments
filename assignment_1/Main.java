package assignment_1;

public class Main {
    public static void main(String[] args) {
        Pizza vegRegularPizza = new Pizza("Veg", false);
        vegRegularPizza.addExtraCheese();
        vegRegularPizza.addExtraToppings();
        vegRegularPizza.addPaperBag();
        System.out.println(vegRegularPizza.generateBill());

        Pizza nonVegDeluxePizza = new DeluxePizza("Non-Veg");
        nonVegDeluxePizza.addExtraCheese();
        nonVegDeluxePizza.addExtraToppings();
        System.out.println(nonVegDeluxePizza.generateBill());
    }
}