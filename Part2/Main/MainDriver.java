package Main;

import Factory.CarbFactory;
import Factory.FatFactory;
import Factory.MacronutrientFactory;
import Factory.ProteinFactory;
import Customer.Customer;

public class MainDriver {
    public static void main(String[] args) {
        // Singleton Design Implementation
        MacronutrientFactory carbsFactory = new CarbFactory();
        MacronutrientFactory proteinFactory = new ProteinFactory();
        MacronutrientFactory fatsFactory = new FatFactory();

        // Creating an array of customers
        Customer[] customers = new Customer[] {
            new Customer("Ramzi", "no restriction"),
            new Customer("Tay", "paleo"),
            new Customer("Brandon", "vegan"),
            new Customer("Leo", "nut allergy"),
            new Customer("Gustavo", "no restriction"),
            new Customer("Kristel", "nut allergy")};

        	// Iterating through each customer
        for (Customer customer : customers) {
        	// Generating meal plan for the customer based on their dietary restriction
            String carbs = carbsFactory.carbPlan(customer.getCustomerDietPlan());
            String protein = proteinFactory.proteinPlan(customer.getCustomerDietPlan());
            String fats = fatsFactory.fatPlan(customer.getCustomerDietPlan());

            System.out.println(customer.getCustomerName() + "'s meal plan [" + customer.getCustomerDietPlan() + "]");
            System.out.println("-Carbs: " + carbs);
            System.out.println("-Protein: " + protein);
            System.out.println("-Fats: " + fats + "\n");
        }
    }
}