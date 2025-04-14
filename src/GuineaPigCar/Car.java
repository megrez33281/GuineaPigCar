package GuineaPigCar;

public class Car {
	
	private CarTypes CarType;
	private int InitialSpeed;
	private int NowSpeed;
	
	
	Car(CarTypes CarType){
		this.CarType = CarType;
	}
	
	protected void setInitialSpeed(int speed) {
		//設置初始速度的時候會是物件建立的時候，NowSpeed也需要一同設置
		InitialSpeed = speed;
		NowSpeed = speed;
	}
	public int getInitialSpeed() {
		return InitialSpeed;
	}
	protected void setNowSpeed(int speed) {
		NowSpeed = speed;
	}
	public int getNowSpeed() {
		return NowSpeed;
	}
	public CarTypes getCarType() {
		return CarType;
	}

}
