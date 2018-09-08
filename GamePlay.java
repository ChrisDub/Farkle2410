package farkle;

import java.util.List;

public class GamePlay {	
	
	public int evalRule(List<Integer> list){
		//TODO need to check score which is stored in Score class
		//Not yet implemented
	    Score s1 = new Score();	
		s1.getScore(list);
		return Score.tempScore;
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
	
	public String whoGoesFirst() {
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