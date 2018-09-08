package farkle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Farkle {

	public static Random rand = new Random();
	
	public static void main(String[] args) {
		
		Player p1 = new Player(0, "Chris West", true);
		GamePlay g1 = new GamePlay();

		p1.roll(6);
		System.out.println(p1.getDiceArray());
		System.out.println(g1.evalRule(p1.getDiceArray()));
		List<Integer> myArray = new ArrayList<>();
		myArray.add(1);
		myArray.add(2);
		myArray.add(3);
		myArray.add(4);
		myArray.add(5);
		myArray.add(6);
		
		System.out.println(g1.evalRule(myArray));
		
		System.out.println(Collections.frequency(myArray, 1));
		/*
		int temp = 0;
		for (int i = 0; i < GamePlay.getDiceArray().size(); i++) {
			
			if (GamePlay.getDiceArray().get(i).equals(1) ) {
				System.out.println("element " +i+" has a 1: " );
				temp = temp + 100;
			}
			
		}
		.
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