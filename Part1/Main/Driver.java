package Main;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Pizza Hut:\n");
        PizzaBuilder.Pizza phPizza1 = new PizzaBuilder("small").setChain("Pizza Hut").addSausage().addPepperoni().addMushrooms().bake();
        PizzaBuilder.Pizza phPizza2 = new PizzaBuilder("medium").setChain("Pizza Hut").addOlives().addHam().addSausage().addBeef().addPepperoni().addBacon().bake();
        PizzaBuilder.Pizza phPizza3 = new PizzaBuilder("large").setChain("Pizza Hut").addHamAndPineapple().addMushrooms().addBeef().addExtraCheese().addOnions().addTomatoandBasil().addPeppers().addSpinach().addOlives().bake();
        phPizza1.eat();
        phPizza2.eat();
        phPizza3.eat();

        System.out.println("\nPizza Chains:\n");
        
        //Chain 1: Pizza hut
        PizzaBuilder.Pizza phPizza4 = new PizzaBuilder("large").setChain("Pizza Hut").addSpinach().addSausage().addMushrooms().bake();
        PizzaBuilder.Pizza phPizza5 = new PizzaBuilder("small").setChain("Pizza Hut").addBacon().addOnions().bake();
        phPizza4.eat();
        phPizza5.eat();


        //Chain 2: Little Caesars
        PizzaBuilder.Pizza lcPizza1 = new PizzaBuilder("medium").setChain("Little Caesars").addPeppers().addChicken().addHam().addSpicyPork().addSausage().addTomatoandBasil().addMushrooms().addPesto().bake();
        PizzaBuilder.Pizza lcPizza2 = new PizzaBuilder("small").setChain("Little Caesars").addPepperoni().addSpinach().addTomatoandBasil().addSpicyPork().addPeppers().addHamAndPineapple().bake();
        lcPizza1.eat();
        lcPizza2.eat();

        //Chain 3: Dominos
        PizzaBuilder.Pizza dPizza1 = new PizzaBuilder("small").setChain("Dominos").addPepperoni().bake();
        PizzaBuilder.Pizza dPizza2 = new PizzaBuilder("large").setChain("Dominos").addSausage().addSpinach().addBeef().bake();
        dPizza1.eat();
        dPizza2.eat();
    }
}
