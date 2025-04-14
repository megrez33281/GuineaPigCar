package GuineaPigCar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Track {
	
	private int TrackLong;
	private ArrayList<GuineaPigCar> Contestants;
	private int NowTime;
	
	Track(int TrackLong){
		this.TrackLong = TrackLong;	
	}
	
	public void addContestant(GuineaPigCar newCar) {
		Contestants.add(newCar);
	}
	
	public ArrayList<GuineaPigCar> getRank(){
		ArrayList<GuineaPigCar> Rank = new ArrayList<GuineaPigCar>();
		for(GuineaPigCar car :Contestants) {
			Rank.add(car);
		}
		Collections.sort(Rank, Comparator.comparing(GuineaPigCar::getLocation).reversed());
		return Rank;
	}
	
	public void FoodDistribution() {
		ArrayList<GuineaPigCar> NowRank = getRank();
		int RankSize = NowRank.size();
		if(RankSize <= 0) {
			return;
		}
		//給第一名吃生菜
		Food Lettuce = new Food(FoodType.LETTUCE);
		GuineaPigCar firstCar = NowRank.get(0);
		firstCar.Eat(Lettuce);
		
		//給最後一名吃蘿蔔
		Food Carrot = new Food(FoodType.CARROT);
		GuineaPigCar lastCar = NowRank.getLast();
		lastCar.Eat(Carrot);
		
	}
	
	public void TimeIncrease(int increaseTime) {
		assert increaseTime >= 0;
		
		for(int i=0; i<increaseTime; i++) {
			boolean ExistCarArriveEnd;
			for(GuineaPigCar car :Contestants) {		
				if(car.getLocation() + car.getNowSpeed() >= TrackLong) {
					//車車在這一秒內會到達終點，需要再根據具體情況調整
				}
				car.Run(1);
			}
			NowTime += 1;
			if(NowTime % 10 == 0) {
				//經過的時間為10的倍數的時候，餵食物
				FoodDistribution();
			}
		}

		
		
	}

}
