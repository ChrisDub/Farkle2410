package farkle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GamePlay {	
	
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
		int result = Player.getRandomNumberInRange(0, 1);
		
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
