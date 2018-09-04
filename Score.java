package farkle;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Score {

	public static int tempScore = 0;

	/**
	 * @param tempScore
	 */
	public Score(int tempScore) {
		super();
		Score.tempScore = tempScore;
	}

	
	public int getTempScore() {
		return tempScore;
	}


	public void setTempScore(int tempScore) {
		Score.tempScore = tempScore;
	}


	public static void getScore(List<Integer> list) {
		
		//TODO only have it calculating if any element = 1
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(1)) {
				tempScore= tempScore +100;	
			}			
		}		
	}
	
	
	public int farkle() {
		//TODO maybe add this into getScore since if it doesn't find
		//any matches to the scoring it will result in a 0??
		return tempScore;
	}
	
	/*
	 * I was thinking we don't really need this when the player is
	 * done with their turn we will just call the Player class and
	 * flip the flag (when the player hits the end turn button) 
	 * or we can try to implement this below: changed to void instead
	 * of boolean
	 * 
	 * Thoughts??
	 * 
	 */
	public void endTurn() {
		if (Player.endTurn == true) 
			Player.setScore(getTempScore());
	}
	
}
