package assignment_1;

public class Pizza {
    private String type;
    private boolean deluxe;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;
    private int basePrice;
    private int totalPrice;

    public Pizza(String type, boolean deluxe) {
        this.type = type;
        this.deluxe = deluxe;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.paperBagAdded = false;

        if (type.equals("Veg")) {
            this.basePrice = 300;
        } else {
            this.basePrice = 400;
        }
        if (deluxe) {
            addExtraCheese();
            addExtraToppings();
        }
        this.totalPrice = this.basePrice;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            totalPrice += 80;
        } 
        // else {
        //     System.out.println("Cheese Already Added");
        // }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            if (type.equals("Veg")) {
                totalPrice += 70;
            } else {
                totalPrice += 120;
            }
        }
        // else {
        //     System.out.println("Toppings Already Added");
        // }
    }

    public void addPaperBag() {
        if (!paperBagAdded) {
            paperBagAdded = true;
            totalPrice += 20;
        }
    }

    public String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");

        if (extraCheeseAdded && !deluxe) {
            bill.append("Extra Cheese Added: 80\n");
        }

        if (extraToppingsAdded && !deluxe) {
            if (type.equals("Veg")) {
                bill.append("Extra Toppings Added: 70\n");
            } else {
                bill.append("Extra Toppings Added: 120\n");
            }
        }

        if (paperBagAdded) {
            bill.append("Paperbag Added: 20\n");
        }

        bill.append("Total Price: ").append(totalPrice).append("\n");
        return bill.toString();
    }
}