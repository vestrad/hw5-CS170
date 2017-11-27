public class TestDiet {

	public static void main(String[] args) {
    	// test Ingredient
	    IngredientDatabase db = new IngredientDatabase();
		
         Recipe cake = new Recipe("chocolate cake");
         cake.addIngredient(db.findIngredient("egg"), 4);
         cake.addIngredient(db.findIngredient("sugar"), 100);
         cake.addIngredient(db.findIngredient("butter"), 100);
         cake.addIngredient(db.findIngredient("flour"), 200);
         cake.addIngredient(db.findIngredient("milk"), 50);
         cake.addIngredient(db.findIngredient("cocoa"), 75);

         System.out.println(cake);
         System.out.println();
         System.out.println(cake.nutritionalValues()); 

	}
    
}
// energy provided by food is measured in kilocalories (kcal)
//1 gram of protein is 4 kcal
//1 gram of fat is 9 kcal
//1 gram of carbohydrates is 4 kcal.

class Ingredient {

	// Private attributes (5), name of ingredient - String, unit of ingredient - String, amount of protein - double, amount of fat - double, amount of carbs - double.
	private String name;
	private String unit;
	private double protein;
	private double fat;
	private double carbs;

	// Constructor that takes the name of the ingredient, unit, amount of protein, amount of fat, and amount of carbs. Then it sets the attributes: name, unit, protein, fat, and carbs
	public Ingredient(String name, String unit, double protein, double fat, double carbs) {
    	this.name = name;
    	this.unit = unit;
    	this.protein = protein;
    	this.fat = fat;
    	this.carbs = carbs;
	}

	// Getter method that takes nothing and returns attribute name
	public String getName() {
    	return name;
	}

	// Getter method that returns attribute unit
	public String getUnit() {
    	return unit;
	}

	// Getter method that takes nothing and returns attribute protein
	public double getProtein() {
    	return protein;
	}

	// Getter method that takes nothing and returns attribute fat
	public double getFat() {
    	return fat;
	}

	// Getter method that takes nothing and returns attribute carbs
	public double getCarbs() {
    	return carbs;
	}

	// Takes the amount of the ingredient as a double and returns the total amount of protein.
	public double computeProtein(double quantity) {
    	return quantity * protein;
	}

	// Takes the amount of the ingredient as a double and returns the total amount of fat.
	public double computeFat(double quantity) {
    	return quantity * fat;
	}

	// Takes the amount of the ingredient as a double and returns the total amount of carbs.
	public double computeCarbohydrates(double quantity) {
    	return quantity * carbs;
	}

	// Takes the amount of the ingredient as a double and returns the total amount of kilocalories.
	public double computeCalories(double quantity) {
    	return quantity * ((protein * 4) + (fat * 9) + (carbs * 4));
	}

	public String toString() { // returns in the following format:      	//"Ingredient : _____"
    	return "Ingredient : " + name;
	}

	
	public String nutritionalValues(double quantity){
	double q = quantity;
	double c = (this.protein * 4) + (this.fat * 9) + (this.carbohydrates * 4);
		    

	return q + " " + unit + " of " + this.name + " contain " + q * this.protein + " " 
		+ unit + " of protein, " + q * this.fat + " " + unit + " of fat, and " + q * this.carbohydrates + 
		" " + unit + " of carbohydrates, for a total of " + c + " calories."
	}
}
// name, unit, protein, fat, carbs
class IngredientDatabase {
	private Ingredient[] ingredients;
	private int numIngredients;

	public IngredientDatabase() {
    	ingredients = new Ingredient[100];
    	ingredients[0] = new Ingredient("flour", "g", 0.11, 0.012, 0.75);
    	ingredients[1] = new Ingredient("milk", "ml", 0.033, 0.038, 0.047);
    	ingredients[2] = new Ingredient("oil", "g", 0, 1, 0);
    	ingredients[3] = new Ingredient("egg", "unit", 6.15, 5.45, 0);
    	ingredients[4] = new Ingredient("sugar", "g", 0, 0, 1);
    	ingredients[5] = new Ingredient("butter", "g", 0.005, 0.82, 0);
    	ingredients[6] = new Ingredient("cocoa", "g", 0.19, 0.22, 0.12);
    	ingredients[7] = new Ingredient("ham", "g", 0.018, 0.05, 0);
    	ingredients[8] = new Ingredient("bananas", "g", 0.01, 0.003, 0.2);
    	ingredients[9] = new Ingredient("carrots boiled", "g", 0.006, 0, 0.04);
    	ingredients[10] = new Ingredient("chestnuts", "g", 0.02, 0.027, 0.37);
    	ingredients[11] = new Ingredient("cola", "g", 0, 0, 0);
    	ingredients[12] = new Ingredient("gooseberries", "g", 0.018, 0.05, 0.122);
    	ingredients[13] = new Ingredient("kidney fried", "g", 0.25, 0.06, 0);
    	ingredients[14] = new Ingredient("liver fried", "g", 0.27, 0.13, 0.07);
    	ingredients[15] = new Ingredient("pork leg roast", "g", 0.27, 0.2, 0);
    	ingredients[16] = new Ingredient("yoghurt natural", "g", 0.059, 0.012, 0.056);

    	numIngredients = 17;
 }
public String findIngredient(String desiredIngredient) {
    	for (int i = 0; i < numIngredients; i++) {
        	if (ingredients[i].getName().equals(desiredIngredient)) { // check for equality of content
            	return ingredients[i].getName();
    	}
    	}
    	return null; // if for loop finishes
	}

}

class Recipe {

	private String name;
	private double numIngredients;
	private Ingredient[] recipe;
	private double[] amounts;

	public Recipe(String name) {
    	this.name = name;
    	numingredients = 0;
    	recipe = new String[100];
    	amounts = new double[100];
	}

	public void addIngredient(Ingredient ingredient, double quanitity) {


	}
	public double computeProtein(){
    	double p = 0;
    	for (i = 0; i < numingredients; i++){
        	p += recipe[i].computeProtein();
}
return p;
}
	public double computeFat(){
    	double p = 0;
    	for (i = 0; i < numingredients; i++){
        	p += recipe[i].computeFat();
}
return p;
}
	public double computeCarbohydrates(){
    	double p = 0;
    	for (i = 0; i < numingredients; i++){
        	p += recipe[i].computeCarbohydrates();
}
return p;
}
	public double computeCalories(){
    	double p = 0;
    	for (i = 0; i < numingredients; i++){
        	p += recipe[i].computeCalories();
}
return p;
}


    
	public String toString() {
    	String result = "Recipe of " + name + ":";
for (int i = 0; i < numIngredients; i++) {
    	result += "\n" + amounts[i] + " " + recipe[i].getUnit() + " of " + recipe[i].getName();
}
	}

	public String nutritionalValues() {
    	String result = "Nutritional values of " + name + ":\n" + "Total protein: " + computeProtein() 
		+ "\nTotal fat: " + computeFat() + "\nTotal carbohydrates: " + computeCarbohydrates() 
		+ "\nTotal calories: " + computeCalories();
    	return result;
	}
}






