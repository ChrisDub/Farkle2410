package farkle;

public class Computer extends Player{

	/**
	 * @param score
	 * @param name
	 */
	public Computer(int score, String name) {
		super(score, name, isPlayer);
	}
	public void autoPlay(Computer c1) {
		Score s1 = new Score();
		while (c1.getScore() < 3000) {
			int diceCnt = 6;
			s1.getScore(c1.roll(diceCnt));
			if (s1.getScore(c1.roll(diceCnt)) > 0) {
				diceCnt = s1.getScore(c1.roll(6-diceCnt));
				c1.setScore(c1.getScore() + s1.getTempScore());
				System.out.println(c1.getScore());
			} else {
				c1.setScore(0);
				System.out.println(c1.getScore());
				System.out.println("farkle you receive no points");
				setEndTurn(true);
				break;
			}

		}
		setEndTurn(true);
		
	}
	/* * * * * * * * Test Client * * * * * * */
	public static void main(String[] args) {
		Computer computerUser = new Computer(0, "The Matrix");
		Score s1 = new Score();
		
		computerUser.autoPlay(computerUser);
		System.out.println(computerUser.endTurn);
		/*
		//computerUser.autoPlay(computerUser);
		System.out.println(computerUser.roll(6));
		System.out.println("number of used Dice: " + s1.getScore(computerUser.getDiceArray()));
		System.out.println(s1.getTempScore());
		computerUser.setScore(s1.getTempScore());
		//computerUser.Collect();
		System.out.println(computerUser.getScore());
		*/
	}
}	