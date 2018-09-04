package farkle;

import java.util.Random;

public class FarkleApp {

	public static Random rand = new Random();
	
	public static void main(String[] args) {
		
		Player p1 = new Player(0, "Chris West", true);
		System.out.println("players turn " + p1.isTurn());
		p1.setTurn(true);
		System.out.println("players turn " + p1.isTurn());
		
		System.out.println("players roll " + p1.roll());


		Score.getScore(Player.getDiceArray());
		
		System.out.println(Score.tempScore);
		
		System.out.println(GamePlay.whoGoesFirst());
		System.out.println(GamePlay.whoGoesFirst());
		System.out.println(GamePlay.whoGoesFirst());
		System.out.println(GamePlay.whoGoesFirst());
		System.out.println(GamePlay.whoGoesFirst());
		/*
		int temp = 0;
		for (int i = 0; i < GamePlay.getDiceArray().size(); i++) {
			
			if (GamePlay.getDiceArray().get(i).equals(1) ) {
				System.out.println("element " +i+" has a 1: " );
				temp = temp + 100;
			}
			
		}
		
		System.out.println(temp);
		*/
		//System.out.println(GamePlay.evalRule(GamePlay.roll()));
		//System.out.println(Score.getScore(GamePlay.getDiceArray()));
	
		/*
		for (Integer i: solution) {
			System.out.println(i);
	}
		*/
	}
}
