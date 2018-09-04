package farkle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Player {
	private static int Score;
	private static String Name;
	public static boolean isPlayer;
	public static boolean isTurn;
	public static boolean endTurn;
	public static boolean roll;
	static Random rand = new Random();
	static List<Integer> diceArray = new ArrayList<>();
	
	/**
	 * @param score
	 * @param name
	 * @param isPlayer
	 */
	public Player(int score, String name, boolean isPlayer) {
		Player.Score = score;
		Player.Name = name;
		Player.isPlayer = isPlayer;
	}
	
	public static List<Integer> getDiceArray() {
		return diceArray;
	}


	public static void setDiceArray(List<Integer> diceArray) {
		Player.diceArray = diceArray;
	}

	public static List<Integer> roll() {
		
		for (int i = 1; i <= 6; i++) {
		diceArray.add(getRandomNumberInRange(1,6));
		}
		
		Collections.shuffle(diceArray);
		return diceArray;
		
	}
	
	public static int getRandomNumberInRange(int min, int max) {
		
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		
		return rand.nextInt((max - min)+1) + min;
	}
	
	public static void setRoll(boolean roll) {
		Player.roll = roll;
	}
	public int getScore() {
		return Score;
	}
	
	public static void setScore(int score) {
		Player.Score = score;
	}
	
	public String getName() {
		return Name;
	}
	
	public static Boolean getIsPlayer() {
		return isPlayer;
	}
	
	public static boolean isEndTurn() {
		return endTurn;
	}

	
	public static boolean isTurn() {
		return isTurn;
	}

	public static void setTurn(boolean isTurn) {
		Player.isTurn = isTurn;
	}

	@Override
	public String toString() {
		return String.format("Name: %s\nScore: %d", Name, Score);
	}
	
	
	
}
