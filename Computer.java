package farkle;

public class Computer {

	private int Score;
	private String Name;
	
	/**
	 * @param score
	 * @param name
	 */
	public Computer(int score, String name) {
		super();
		Score = score;
		Name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public String getName() {
		return Name;
	}

	public static void autoPlay() {
		
	}
}
