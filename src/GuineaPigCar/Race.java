package GuineaPigCar;

import java.util.ArrayList;

public class Race {
    public static void main(String[] args) {
    	//建立跑道
    	Track track = new Track(4000);
    	
    	//建立天竺鼠車車
    	GuineaPigCar car1 = new GuineaPigCar("車車一號", CarTypes.POLICEC_CAR);
    	GuineaPigCar car2 = new GuineaPigCar("車車二號", CarTypes.AMBULANCE);
    	GuineaPigCar car3 = new GuineaPigCar("車車三號", CarTypes.GARBAGE_TRUCK);
    	
    	//將車車加入跑道
    	track.addContestant(car1);
    	track.addContestant(car2);
    	track.addContestant(car3);
    	
    	boolean FirstExist = false;
    	while(!FirstExist) {
    		FirstExist = track.TimeIncrease(1);
    	}
    	ArrayList<GuineaPigCar> Rank = track.getRank();
    	for(GuineaPigCar car : Rank) {
    		if(car.getLocation() >= track.getTrackLong()) {
    			System.out.println(car.getName() + "獲得了第1名！");
    		}
    	}
    	
    	
    }
}
