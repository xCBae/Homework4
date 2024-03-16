package Factory;

public interface MacronutrientFactory {
	// Method to generate meal plans based on dietary restriction
    String carbPlan(String plan);
    String proteinPlan(String plan);
    String fatPlan(String plan);
}
