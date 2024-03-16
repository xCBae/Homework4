package Factory;

import java.util.Random;

public class FatFactory implements MacronutrientFactory{
    private Random rand = new Random();
    
    // Arrays to store foods for different dietary restrictions
    private String[] noRestrictionFoods = {"Avocado", "Sour Cream", "Tuna", "Peanuts"};
    private String[] paleoFoods = {"Avocado", "Tuna", "Peanuts"};
    private String[] veganFoods = {"Avocado", "Peanuts"};
    private String[] nutAllergyFoods = {"Avocado", "Sour Cream", "Tuna"};

    public String fatPlan(String diet) {
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
    public String proteinPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'proteinPlan'");
    }
}