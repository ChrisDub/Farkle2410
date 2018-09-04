package farkle;

public class Player {
	private static int Score;
	private static String Name;
	public static boolean isPlayer;
	public static boolean isTurn;
	public static boolean endTurn;
	public static boolean roll;
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
	
	public static boolean Roll() {
		return roll;
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
