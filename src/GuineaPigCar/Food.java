package GuineaPigCar;

public class Food {
	
	private String FoodName;
	private FoodType foodType;
	
	
	Food(FoodType foodType){
		this.FoodName = "";
		this.foodType = foodType;
		if(foodType == FoodType.CARROT) {
			FoodName = "紅蘿蔔";
		}
		else if(foodType == FoodType.LETTUCE) {
			FoodName = "生菜";
		}
	}
	
	public String getFoodName() {
		
		return FoodName;
	}
	
	public FoodType getFoodType() {
		return foodType;
	}
}
