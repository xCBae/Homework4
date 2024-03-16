package Main;

import java.util.ArrayList;

public class PizzaBuilder {
    private ArrayList<String> builderToppings;
    private String builderSize;
    private String builderChain;

    public class Pizza {

        private ArrayList<String> pizzaToppings;
        private String pizzaSize;
        private String pizzaChain;

        public Pizza(ArrayList<String> toppings, String size, String chain) {
            this.pizzaToppings = new ArrayList<String>();
            this.pizzaToppings.addAll(toppings);
            this.pizzaSize = size;
            this.pizzaChain = chain;
        }


        public void eat() {
            System.out.print("Eating a " + this.pizzaSize + " pizza from " + this.pizzaChain + " with the following toppings: ");
            for (int i = 0; i < pizzaToppings.size(); i++) {
                if (i < pizzaToppings.size() - 1) {
                    System.out.print(pizzaToppings.get(i) + ", ");
                } else {
                    System.out.println("and " + pizzaToppings.get(i) + ".");
                }
            }
        }

    }

    public PizzaBuilder(String size) {
        this.builderToppings = new ArrayList<String>();
        this.builderChain = null;
        switch (size.toLowerCase()) {
            case "small":
            case "medium":
            case "large":
                this.builderSize = size.toLowerCase();
                break;
            default:
                this.builderSize = "small";
                break;
        }
    }

    public PizzaBuilder setChain(String chain) {
        this.builderChain = chain;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        switch (size.toLowerCase()) {
            case "small":
            case "medium":
            case "large":
                this.builderSize = size.toLowerCase();
                break;
            default:
                this.builderSize = "small";
                break;
        }
        return this;
    }

    public PizzaBuilder addPepperoni() {
        if (isToppingAbsent("pepperoni")) {
            this.builderToppings.add("pepperoni");
        }
        return this;
    }

    public PizzaBuilder addSausage() {
        if (isToppingAbsent("sausage")) {
            this.builderToppings.add("sausage");
        }
        return this;
    }

    public PizzaBuilder addMushrooms() {
        if (isToppingAbsent("mushrooms")) {
            this.builderToppings.add("mushrooms");
        }
        return this;
    }

    public PizzaBuilder addBacon() {
        if (isToppingAbsent("bacon")) {
            this.builderToppings.add("bacon");
        }
        return this;
    }

    public PizzaBuilder addOnions() {
        if (isToppingAbsent("onions")) {
            this.builderToppings.add("onions");
        }
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        if (isToppingAbsent("extra cheese")) {
            this.builderToppings.add("extra cheese");
        }
        return this;
    }

    public PizzaBuilder addPeppers() {
        if (isToppingAbsent("peppers")) {
            this.builderToppings.add("peppers");
        }
        return this;
    }

    public PizzaBuilder addChicken() {
        if (isToppingAbsent("chicken")) {
            this.builderToppings.add("chicken");
        }
        return this;
    }

    public PizzaBuilder addOlives() {
        if (isToppingAbsent("olives")) {
            this.builderToppings.add("olives");
        }
        return this;
    }

    public PizzaBuilder addSpinach() {
        if (isToppingAbsent("spinach")) {
            this.builderToppings.add("spinach");
        }
        return this;
    }

    public PizzaBuilder addTomatoandBasil() {
        if (isToppingAbsent("tomato and basil")) {
            this.builderToppings.add("tomato and basil");
        }
        return this;
    }

    public PizzaBuilder addBeef() {
        if (isToppingAbsent("beef")) {
            this.builderToppings.add("beef");
        }
        return this;
    }

    public PizzaBuilder addHam() {
        if (isToppingAbsent("ham")) {
            this.builderToppings.add("ham");
        }
        return this;
    }

    public PizzaBuilder addPesto() {
        if (isToppingAbsent("pesto")) {
            this.builderToppings.add("pesto");
        }
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        if (isToppingAbsent("spicy pork")) {
            this.builderToppings.add("spicy pork");
        }
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        if (isToppingAbsent("ham and pineapple")) {
            this.builderToppings.add("ham and pineapple");
        }
        return this;
    }

    public Pizza bake() {
        if (this.builderSize == null || this.builderChain == null) {
            return null;
        }
        return new Pizza(builderToppings, builderSize, builderChain);
    }

    private boolean isToppingAbsent(String searchTopping) {
        for (String topping : this.builderToppings) {
            if (topping.equals(searchTopping)) {
                return false;
            }
        }
        return true;
    }
}
