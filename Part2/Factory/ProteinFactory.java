package Factory;

import java.util.Random;

public class ProteinFactory implements MacronutrientFactory{
    private Random rand = new Random();
    
    // Arrays to store foods for different dietary restrictions
    private String[] noRestrictionFoods = {"Fish", "Chicken", "Beef", "Tofu"};
    private String[] paleoFoods = {"Fish", "Chicken", "Beef"};
    private String[] veganFoods = {"Tofu"};
    private String[] nutAllergyFoods = {"Fish", "Chicken", "Beef", "Tofu"};

    public String proteinPlan(String diet) {
    	// Checking the dietary restriction and returning a randomly selected food
        if (diet == "no restriction") {
            return noRestrictionFoods[rand.nextInt(noRestrictionFoods.length)];
        }
        else if(diet == "paleo") {
            return paleoFoods[rand.nextInt(paleoFoods.length)];
        }
        else if(diet == "vegan") {
            return veganFoods[rand.nextInt(veganFoods.length)];
        }
        else if(diet == "nut allergy") {
            return nutAllergyFoods[rand.nextInt(nutAllergyFoods.length)];
        }
        else {
            return "No diet plan given";
        }
    }

    @Override
    public String carbPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'carbPlan'");
    }

    @Override
    public String fatPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'fatPlan'");
    }

}