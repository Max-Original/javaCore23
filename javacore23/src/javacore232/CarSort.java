package javacore232;

import java.util.Comparator;

public class CarSort implements Comparator<Car>{

	@Override
	public int compare(Car obj1, Car obj2) {
		
		int speed1 = obj1.getTopSpeed();
		int speed2 = obj2.getTopSpeed();
		String brand1 = obj1.getBrand();
		String brand2 = obj2.getBrand();
		
		
		if (speed1 > speed2) {
			return 1;
		} else if (speed1 < speed2) {
			return -1;
		} else {
			if (brand1.compareTo(brand2) > 0) {
				return 1;
			} else if (brand1.compareTo(brand2) < 0) {
				return -1;
			} else {
				return 0;
			}
		}
	}

}
