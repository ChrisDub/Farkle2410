package farkle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Player {
	public int Score;
	private static String Name;
	public static boolean isPlayer;
	public static boolean isTurn;
	public boolean endTurn;
	public static boolean roll;
	static Random rand = new Random();
	private List<Integer> diceArray;
	
	/**
	 * @param score
	 * @param name
	 * @param isPlayer
	 */
	public Player(int score, String name, boolean isPlayer) {
		this.Score = score;
		Player.Name = name;
		Player.isPlayer = isPlayer;
	}
	
	public List<Integer> getDiceArray() {
		return this.diceArray;
	}


	public void setDiceArray(List<Integer> diceArray) {
		this.diceArray = diceArray;
	}

	public List<Integer> roll(int diceCnt) {
		diceArray = new ArrayList<>();
		for (int i = 1; i <= diceCnt; i++) {
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
	
	public int getScore() {
		return Score;
	}
	
	
	public void setScore(int score) {
		this.Score = score;
	}
	
	public String getName() {
		return Name;
	}
	
	public Boolean getIsPlayer() {
		return isPlayer;
	}
	
	public boolean isEndTurn() {
		return endTurn;
	}

	
	public boolean isTurn() {
		return isTurn;
	}

	public void setTurn(boolean isTurn) {
		Player.isTurn = isTurn;
	}

	public void setEndTurn(boolean isEndTurn) {
		this.endTurn = isEndTurn;
	}
	
	public int collect(List<Integer> diceArray) {
		Score s1 = new Score();
		
		int score = s1.getScore(diceArray);
		return score;
		
		
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\nScore: %d", Name, Score);
	}
	
	/* * * * * * * * Test Client * * * * * * */
	public static void main(String[] args) {
		Player humanUser = new Player(0, "Chris", true);
		
		List<Integer> Array = new ArrayList<>();
		Array.add(1);
		Array.add(2);
		Array.add(3);
		Array.add(4);
		Array.add(5);
		Array.add(6);
		humanUser.setDiceArray(Array);
		
//		humanUser.roll();
		humanUser.setScore(humanUser.collect(Array));
		System.out.println("Roll: " + humanUser.getDiceArray());
		System.out.println("GetScore: " + humanUser.getScore());
		System.out.println("GetName: " + humanUser.getName());
		System.out.println("is player: " + humanUser.getIsPlayer());
		
		System.out.println("is turn: " + humanUser.isTurn());
		humanUser.setTurn(true);
		System.out.println("is turn: " + humanUser.isTurn());
		
		System.out.println("is end turn: "  + humanUser.isEndTurn());
		humanUser.setEndTurn(true);
		System.out.println("is end turn: "  + humanUser.isEndTurn());
		
	}
}
