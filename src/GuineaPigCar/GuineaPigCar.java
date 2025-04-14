package GuineaPigCar;

import java.util.ArrayList;

public class GuineaPigCar extends Car implements GuineaPig {
	private String Name;
	private ArrayList<Food> Stomach;
	private int StomachCapacity;
	private int Location;
	private int CarrotSpeedUp;
	
	
	
	GuineaPigCar(String Name, CarTypes CarType){
		super(CarType);
		this.Name = Name;
		//設置天竺鼠車車的初始速度
		setCarInitialSpeedandCarrotSpeedUp(CarType);
		Stomach = new ArrayList<Food>();
		StomachCapacity = 5;
		Location = 0;
		
	}
	
	private void setCarInitialSpeedandCarrotSpeedUp(CarTypes CarType) {
		if(CarType == CarTypes.POLICEC_CAR) {
			setInitialSpeed(14);
			CarrotSpeedUp = 5;
		}
		else if(CarType == CarTypes.AMBULANCE) {
			setInitialSpeed(11);
			CarrotSpeedUp = 2;
		}
		
		else if(CarType == CarTypes.GARBAGE_TRUCK) {
			setInitialSpeed(8);
			CarrotSpeedUp = 4;
		}
		
	}

	public void Squeak(){
	    System.out.println("PUI PUI");
	}
	
	public void Eat(Food food) {
		Stomach.add(food);
		if(food.getFoodType() == FoodType.CARROT) {
			//吃到紅蘿蔔時可以加速
			int NowSpeed = getNowSpeed();
			setNowSpeed(NowSpeed + CarrotSpeedUp);
			
		}
		if(Stomach.size() >= StomachCapacity) {
			//當天竺鼠車車吃到超過上限的食物時就會PUPU
			PUPU();
		}
		
	}
	public void PUPU() {
		//原樣大出所有食物
		Stomach.clear();
		int InitialSpeed = getInitialSpeed();
		setNowSpeed(InitialSpeed);
	}
	
	public void Run(int Seconds) {
		int NowSpeed = getNowSpeed();
		int Displacement = NowSpeed*Seconds;
		Location += Displacement;
	}
	public int getLocation() {
		return Location;
	}

}
