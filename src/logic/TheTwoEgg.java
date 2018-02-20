package logic;

import java.util.ArrayList;

public class TheTwoEgg {

	/**
	 * A building has 100 floors. One of the floors is the highest
	 * floor an egg can be dropped from without breaking.
	 * If an egg is dropped from above that floor, it will break.
	 * If it is dropped from that floor or below, 
	 * it will be completely undamaged and you can drop the egg again.
	 * Given two eggs, find the highest floor an egg can be 
	 * dropped from without breaking, with as few drops as possible. 
	 * 
	 * 
	 */
	
	
	private int sentinal;
	private ArrayList<Integer> floors;
	public TheTwoEgg(int sentinal, ArrayList<Integer> floors) {
		this.sentinal = sentinal;
		this.floors = floors;
	}
	public int getSentinal() {
		return sentinal;
	}
	public ArrayList<Integer> getFloors() {
		return floors;
	}
	
	
}
