package farkle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GamePlay {

	static Random rand = new Random();
	static List<Integer> diceArray = new ArrayList<>();
	
	public static List<Integer> roll() {
		
		for (int i = 1; i <= 6; i++) {
		diceArray.add(getRandomNumberInRange(1,6));
		}
		
		Collections.shuffle(diceArray);
		return diceArray;
		
	}

	
	public static List<Integer> getDiceArray() {
		return diceArray;
	}


	public static void setDiceArray(List<Integer> diceArray) {
		GamePlay.diceArray = diceArray;
	}


	public static int getRandomNumberInRange(int min, int max) {
		
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		
		return rand.nextInt((max - min)+1) + min;
	}
	
	public static int evalRule(List<Integer> list){
		//TODO need to check score which is stored in Score class
		//Not yet implemented
		
		//return Score.getScore(list);
		return 0;
	}
	
	public static void currentWinner(Player p, int Score) {
		//TODO
		//Not yet implemented		
	}
	
	public static boolean isComputer() {
		if (Player.isPlayer == false) {
			return true;
		}
		return false;
	}
	
	public static String whoGoesFirst() {
		int result = rand.nextInt();
		
		if (result == 0) {
			return "Human goes first";
		}
		return "Computer goes frist";
	}
	
	public static int currentScore(Player p) {
		//TODO	
		//Not yet implemented
		return 0;
	}
}
