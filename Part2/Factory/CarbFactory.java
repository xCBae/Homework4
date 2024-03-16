package Factory;

import java.util.Random;

public class CarbFactory implements MacronutrientFactory{
	
	// Arrays to store foods for different dietary restrictions
    private Random rand = new Random();
    private String[] noRestrictionFoods = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private String[] paleoFoods = {"Pistachio"};
    private String[] veganFoods = {"Bread", "Lentils", "Pistachio"};
    private String[] nutAllergyFoods = {"Cheese", "Bread", "Lentils"};

    public String carbPlan(String diet) {
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
    public String proteinPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'proteinPlan'");
    }

    @Override
    public String fatPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'fatPlan'");
    }

}