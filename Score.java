package farkle;

import java.util.Collections;
import java.util.List;

public class Score {

	public static int tempScore = 0;

	/**
	 * @param tempScore
	 */
	public Score() {
	}

	
	public int getTempScore() {
		return tempScore;
	}


	public void setTempScore(int tempScore) {
		Score.tempScore = tempScore;
	}


	public int getScore(List<Integer> list) {
	
		int cntOne;
		int cntTwo;
		int cntThree;
		int cntFour;
		int cntFive;
		int cntSix;
		int usedDiceCnt = 0;
		
		cntOne = Collections.frequency(list, 1);
		cntTwo = Collections.frequency(list, 2);
		cntThree = Collections.frequency(list, 3);
		cntFour = Collections.frequency(list, 4);
		cntFive = Collections.frequency(list, 5);
		cntSix = Collections.frequency(list, 6);
		
		if (cntOne == 6 | cntTwo == 6 | cntThree == 6 | cntFour == 6 | cntFive == 6 | cntSix == 6) {
			setTempScore(3000);	//6 of one number
			usedDiceCnt = 6;
		}else if ((cntOne == 3 & cntTwo == 3) | (cntOne == 3 & cntThree == 3) | (cntOne == 3 & cntFour == 3) | (cntOne == 3 & cntFive == 3) | (cntOne == 3 & cntSix == 3)
				| (cntTwo == 3 & cntThree == 3) | (cntTwo == 3 & cntFour == 3) | (cntTwo == 3 & cntFive == 3) | (cntTwo == 3 & cntSix == 3) | (cntThree == 3 & cntFour == 3)
				| (cntThree == 3 & cntFive == 3) | (cntThree == 3 & cntSix == 3) | (cntFour == 3 & cntFive == 3) | (cntFour == 3 & cntSix == 3) | (cntFive == 3 & cntSix == 3)) {
			setTempScore(2500);	//2 sets of three numbers
			usedDiceCnt = 6;
		}else if (cntOne == 5 | cntTwo == 5 | cntThree == 5 | cntFour == 5 | cntFive == 5 | cntSix == 5) {
			setTempScore(2000);	//1 set of five numbers
			usedDiceCnt = 5;
		}else if ((cntOne == 4 | cntTwo == 4 | cntThree == 4 | cntFour == 4 | cntFive == 4 | cntSix == 4) 
				& (cntOne == 2 | cntTwo == 2 | cntThree == 2 | cntFour == 2 | cntFive == 2 | cntSix == 2)) {
			setTempScore(1500);	//1 set of four numbers and 1 pair
			usedDiceCnt = 6;
		}else if (cntOne == 1 & cntTwo == 1 & cntThree == 1 & cntFour == 1 & cntFive == 1 & cntSix == 1) {
			setTempScore( 1500);	//1 - 6 straight
			usedDiceCnt = 6;
		}else if ((cntOne == 2 & cntTwo == 2 & cntThree == 2) | (cntOne == 2 & cntTwo == 2 & cntFour == 2) | (cntOne == 2 & cntTwo == 2 & cntFive == 2) | (cntOne == 2 & cntTwo == 2 & cntSix == 2) 
				 | (cntOne == 2 & cntThree == 2 & cntFour == 2) | (cntOne == 2 & cntThree == 2 & cntFive == 2) | (cntOne == 2 & cntThree == 2 & cntSix == 2) | (cntOne == 2 & cntFour == 2 & cntFive == 2)
				 | (cntOne == 2 & cntFour == 2 & cntSix == 2) | (cntOne == 2 & cntFive == 2 & cntSix == 2) | (cntTwo == 2 & cntThree == 2 & cntFour == 2) | (cntTwo == 2 & cntThree == 2 & cntFive == 2)
				 | (cntTwo == 2 & cntThree == 2 & cntSix == 2) | (cntTwo == 2 & cntFour == 2 & cntFive == 2) | (cntTwo == 2 & cntFour == 2 & cntSix == 2) | (cntTwo == 2 & cntFive == 2 & cntSix == 2)
				 | (cntThree == 2 & cntFour == 2 & cntFive == 2) | (cntThree == 2 & cntFour == 2 & cntSix == 2) | (cntThree == 2 & cntFive == 2 & cntSix == 2) | (cntFour == 2 & cntFive == 2 & cntSix == 2)) {
			setTempScore( 1500);	//3 sets of pair
			usedDiceCnt = 6;
			//TODO still not working correctly
		}else if (cntOne == 4 | cntTwo == 4 | cntThree == 4 | cntFour == 4 | cntFive == 4 | cntSix == 4) {
			setTempScore( 1500);	//1 set of four
			usedDiceCnt = 4;
		}else if (cntOne == 3) {
			setTempScore( 300);
			usedDiceCnt = 3;
		}else if (cntTwo == 3) {
			setTempScore( 200);
			usedDiceCnt = 3;
		}else if (cntThree == 3) {
			setTempScore( 300);
			usedDiceCnt = 3;
		}else if (cntFour == 3) {
			setTempScore( 400);
			usedDiceCnt = 3;
		}else if (cntFive == 3) {
			setTempScore( 500);
			usedDiceCnt = 3;
		}else if (cntSix == 3) {
			setTempScore( 600);
			usedDiceCnt = 3;
		}else if (cntOne == 1 & cntFive < 1) {
			setTempScore( 100);
			usedDiceCnt = 1;
		}else if (cntOne == 2 & cntFive < 1) {
			setTempScore( 200);
			usedDiceCnt = 2;
		}else if (cntFive == 1 & cntOne < 1) {
			setTempScore( 50);
			usedDiceCnt = 1;
		}else if (cntFive == 2 & cntOne < 1) {
			setTempScore( 100);
			usedDiceCnt = 2;
		}else if (cntOne == 1 & cntFive ==1) {
			setTempScore( 150);
			usedDiceCnt = 2;
		}else if (cntOne == 1 & cntFive == 2) {
			setTempScore( 200);
			usedDiceCnt = 3;
		}else if (cntOne == 2 & cntFive ==1) {
			setTempScore( 250);
			usedDiceCnt = 3;
		}
			
		return usedDiceCnt;
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
	/*
	public void endTurn() {
		if (Player.endTurn == true) 
			Player.setScore(getTempScore());
	}
	*/
}