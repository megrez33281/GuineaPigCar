package GuineaPigCar;

public class Food {
	
	private String FoodName;
	private FoodType foodType;
	
	
	Food(FoodType foodType){
		this.FoodName = "";
		this.foodType = foodType;
	}
	
	public String getFoodName() {
		
		return FoodName;
	}
	
	public FoodType getFoodType() {
		return foodType;
	}
}
