/**
 * 
 */
package farkle;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author Owner
 *
 */
class ScoreTest {
	Player newPlayer = new Player(0, "Chris", true);
	Score s1 = new Score();
	@Test
	void testGetScoreOneSetOfSix_Ones() {
		List<Integer> myArray = createTestArray(1, 1, 1, 1, 1, 1);
		newPlayer.collect(myArray);
		assertEquals(3000, s1.getTempScore());
	}

	@Test
	void testGetScoreOneSetOfSix_Twos() {
		List<Integer> myArray = createTestArray(2, 2, 2, 2, 2, 2);
		newPlayer.collect(myArray);
		assertEquals(3000, s1.getTempScore());
	}

	@Test
	void testGetScoreOneSetOfSix_Threes() {
		List<Integer> myArray = createTestArray(3, 3, 3, 3, 3, 3);
		newPlayer.collect(myArray);
		assertEquals(3000, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfSix_Fours() {
		List<Integer> myArray = createTestArray(4, 4, 4, 4, 4, 4);
		newPlayer.collect(myArray);
		assertEquals(3000, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfSix_Fives() {
		List<Integer> myArray = createTestArray(5, 5, 5, 5, 5, 5);	
		newPlayer.collect(myArray);	
		assertEquals(3000, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_OneAndTwo() {
		List<Integer> myArray = createTestArray(1,1,1,2,2,2);		
		newPlayer.collect(myArray);
		assertEquals(2500, s1.getTempScore());
	}

	@Test
	void testGetScoreTwoSetsOfThree_OneAndThree() {
		List<Integer> myArray = createTestArray(1,1,1,3,3,3);		
		newPlayer.collect(myArray);
		assertEquals(2500, s1.getTempScore());
	}

	@Test
	void testGetScoreTwoSetsOfThree_OneAndFour() {
		List<Integer> myArray = createTestArray(1,1,1,4,4,4);
		newPlayer.collect(myArray);		
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_OneAndFive() {
		List<Integer> myArray = createTestArray(1,1,1,5,5,5);
		newPlayer.collect(myArray);		
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_TwoAndThree() {
		List<Integer> myArray = createTestArray(2,2,2,3,3,3);
		newPlayer.collect(myArray);		
		assertEquals(2500, s1.getTempScore());
	}

	@Test
	void testGetScoreTwoSetsOfThree_TwoAndFour() {
		List<Integer> myArray = createTestArray(2,2,2,4,4,4);		
		newPlayer.collect(myArray);
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_TwoAndFive() {
		List<Integer> myArray = createTestArray(2,2,2,5,5,5);		
		newPlayer.collect(myArray);
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_TwoAndSix() {
		List<Integer> myArray = createTestArray(2,2,2,6,6,6);		
		newPlayer.collect(myArray);
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_ThreeAndFour() {
		List<Integer> myArray = createTestArray(3,3,3,4,4,4);
		newPlayer.collect(myArray);		
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_ThreeAndFive() {
		List<Integer> myArray = createTestArray(3,3,3,5,5,5);		
		newPlayer.collect(myArray);
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_ThreeAndSix() {
		List<Integer> myArray = createTestArray(3,3,3,6,6,6);
		newPlayer.collect(myArray);		
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_FourAndFive() {
		List<Integer> myArray = createTestArray(4,4,4,5,5,5);
		newPlayer.collect(myArray);		
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_FourAndSix() {
		List<Integer> myArray = createTestArray(4,4,4,6,6,6);
		newPlayer.collect(myArray);		
		assertEquals(2500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoSetsOfThree_FiveAndSix() {
		List<Integer> myArray = createTestArray(5,5,5,6,6,6);		
		newPlayer.collect(myArray);
		assertEquals(2500, s1.getTempScore());
	}	
	
	@Test
	void testGetScoreOneSetOfFive_One() {
		List<Integer> myArray = createTestArray(1,1,1,1,1,6);
		newPlayer.collect(myArray);		
		assertEquals(2000, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFive_Two() {
		List<Integer> myArray = createTestArray(2,2,2,2,2,6);	
		newPlayer.collect(myArray);	
		assertEquals(2000, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFive_Three() {
		List<Integer> myArray = createTestArray(3,3,3,3,3,6);
		newPlayer.collect(myArray);		
		assertEquals(2000, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFive_Four() {
		List<Integer> myArray = createTestArray(4,4,4,4,4,6);
		newPlayer.collect(myArray);		
		assertEquals(2000, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFive_Five() {
		List<Integer> myArray = createTestArray(5,5,5,5,5,6);
		newPlayer.collect(myArray);		
		assertEquals(2000, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFive_Six() {
		List<Integer> myArray = createTestArray(1,6,6,6,6,6);		
		newPlayer.collect(myArray);
		assertEquals(2000, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFourAndOnePair_OneTwo() {
		List<Integer> myArray = createTestArray(1,1,1,1,2,2);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFourAndOnePair_OneThree() {
		List<Integer> myArray = createTestArray(1,1,1,1,3,3);	
		newPlayer.collect(myArray);	
		assertEquals(1500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFourAndOnePair_OneFour() {
		List<Integer> myArray = createTestArray(1,1,1,1,4,4);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFourAndOnePair_OneFive() {
		List<Integer> myArray = createTestArray(1,1,1,1,5,5);	
		newPlayer.collect(myArray);	
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreOneSetOfFourAndOnePair_OneSix() {
		List<Integer> myArray = createTestArray(1,1,1,1,6,6);	
		newPlayer.collect(myArray);	
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreOneSetOfFourAndOnePair_TwoOne() {
		List<Integer> myArray = createTestArray(2,2,2,2,1,1);	
		newPlayer.collect(myArray);	
		assertEquals(1500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFourAndOnePair_TwoThree() {
		List<Integer> myArray = createTestArray(2,2,2,2,3,3);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFourAndOnePair_TwoFour() {
		List<Integer> myArray = createTestArray(2,2,2,2,4,4);	
		newPlayer.collect(myArray);	
		assertEquals(1500, s1.getTempScore());
	}	
	
	@Test
	void testGetScoreOneSetOfFourAndOnePair_TwoFive() {
		List<Integer> myArray = createTestArray(2,2,2,2,5,5);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_TwoSix() {
		List<Integer> myArray = createTestArray(2,2,2,2,6,6);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_ThreeOne() {
		List<Integer> myArray = createTestArray(3,3,3,3,1,1);	
		newPlayer.collect(myArray);	
		assertEquals(1500, s1.getTempScore());
	}		

	@Test
	void testGetScoreOneSetOfFourAndOnePair_ThreeTwo() {
		List<Integer> myArray = createTestArray(3,3,3,3,2,2);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_ThreeFour() {
		List<Integer> myArray = createTestArray(3,3,3,3,4,4);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_ThreeFive() {
		List<Integer> myArray = createTestArray(3,3,3,3,5,5);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_ThreeSix() {
		List<Integer> myArray = createTestArray(3,3,3,3,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FourOne() {
		List<Integer> myArray = createTestArray(4,4,4,4,1,1);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FourTwo() {
		List<Integer> myArray = createTestArray(4,4,4,4,2,2);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FourThree() {
		List<Integer> myArray = createTestArray(4,4,4,4,3,3);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}	
	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FourFive() {
		List<Integer> myArray = createTestArray(4,4,4,4,5,5);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FourSix() {
		List<Integer> myArray = createTestArray(4,4,4,4,6,6);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FiveOne() {
		List<Integer> myArray = createTestArray(5,5,5,5,1,1);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}	
	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FiveTwo() {
		List<Integer> myArray = createTestArray(5,5,5,5,2,2);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	
	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FiveThree() {
		List<Integer> myArray = createTestArray(5,5,5,5,3,3);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FiveFour() {
		List<Integer> myArray = createTestArray(5,5,5,5,4,4);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	
	

	@Test
	void testGetScoreOneSetOfFourAndOnePair_FiveSix() {
		List<Integer> myArray = createTestArray(5,5,5,5,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreStraight() {
		List<Integer> myArray = createTestArray(1,2,3,4,5,6);		
		newPlayer.collect(myArray);
		assertEquals(1500, s1.getTempScore());
	}	
	

	@Test
	void testGetScoreThreeSetsOfPairs_OneTwoThree() {
		List<Integer> myArray = createTestArray(1,1,2,2,3,3);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreThreeSetsOfPairs_OneTwoFour() {
		List<Integer> myArray = createTestArray(1,1,2,2,4,4);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_OneTwoFive() {
		List<Integer> myArray = createTestArray(1,1,2,2,5,5);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_OneTwoSix() {
		List<Integer> myArray = createTestArray(1,1,2,2,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_OneThreeFour() {
		List<Integer> myArray = createTestArray(1,1,3,3,4,4);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_OneThreeFive() {
		List<Integer> myArray = createTestArray(1,1,3,3,5,5);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_OneThreeSix() {
		List<Integer> myArray = createTestArray(1,1,3,3,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_OneFourFive() {
		List<Integer> myArray = createTestArray(1,1,4,4,5,5);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_OneFourSix() {
		List<Integer> myArray = createTestArray(1,1,4,4,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	
	
	@Test
	void testGetScoreThreeSetsOfPairs_OneFiveSix() {
		List<Integer> myArray = createTestArray(1,1,5,5,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_TwoThreeFour() {
		List<Integer> myArray = createTestArray(2,2,3,3,4,4);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_TwoThreeFive() {
		List<Integer> myArray = createTestArray(2,2,3,3,5,5);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreThreeSetsOfPairs_TwoThreeSix() {
		List<Integer> myArray = createTestArray(2,2,3,3,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_TwoFourFive() {
		List<Integer> myArray = createTestArray(2,2,4,4,5,5);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_TwoFourSix() {
		List<Integer> myArray = createTestArray(2,2,4,4,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_TwoFiveSix() {
		List<Integer> myArray = createTestArray(2,2,5,5,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreThreeSetsOfPairs_ThreeFourFive() {
		List<Integer> myArray = createTestArray(3,3,4,4,5,5);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_ThreeFourSix() {
		List<Integer> myArray = createTestArray(2,2,4,4,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_ThreeFiveSix() {
		List<Integer> myArray = createTestArray(2,2,5,5,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}

	@Test
	void testGetScoreThreeSetsOfPairs_FourFiveSix() {
		List<Integer> myArray = createTestArray(4,4,5,5,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfFour_One() {
		List<Integer> myArray = createTestArray(1,1,1,1,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFour_Two() {
		List<Integer> myArray = createTestArray(2,2,2,2,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	
	
	@Test
	void testGetScoreOneSetOfFour_Three() {
		List<Integer> myArray = createTestArray(3,3,3,3,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	
	
	@Test
	void testGetScoreOneSetOfFour_Four() {
		List<Integer> myArray = createTestArray(4,4,4,4,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	

	@Test
	void testGetScoreOneSetOfFour_Five() {
		List<Integer> myArray = createTestArray(5,5,5,5,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}	
	
	@Test
	void testGetScoreOneSetOfFour_Six() {
		List<Integer> myArray = createTestArray(1,1,6,6,6,6);
		newPlayer.collect(myArray);		
		assertEquals(1500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfThree_One() {
		List<Integer> myArray = createTestArray(1,1,1,2,6,6);
		newPlayer.collect(myArray);		
		assertEquals(300, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfThree_Two() {
		List<Integer> myArray = createTestArray(1,2,2,2,6,6);
		newPlayer.collect(myArray);		
		assertEquals(200, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfThree_Three() {
		List<Integer> myArray = createTestArray(1,3,3,3,6,6);
		newPlayer.collect(myArray);		
		assertEquals(300, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfThree_Four() {
		List<Integer> myArray = createTestArray(4,4,4,2,6,6);
		newPlayer.collect(myArray);		
		assertEquals(400, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfThree_Five() {
		List<Integer> myArray = createTestArray(5,5,5,2,6,6);
		newPlayer.collect(myArray);		
		assertEquals(500, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneSetOfThree_Six() {
		List<Integer> myArray = createTestArray(1,1,6,2,6,6);
		newPlayer.collect(myArray);		
		assertEquals(600, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneOneAndNoFives_One() {
		List<Integer> myArray = createTestArray(1,2,3,2,4,6);
		newPlayer.collect(myArray);		
		assertEquals(100, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoOnesAndNotFives_One() {
		List<Integer> myArray = createTestArray(1,2,1,2,4,6);
		newPlayer.collect(myArray);		
		assertEquals(200, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneFiveAndNoOnes_Five() {
		List<Integer> myArray = createTestArray(5,2,3,2,4,6);
		newPlayer.collect(myArray);		
		assertEquals(50, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoFivesAndNoOnes_Five() {
		List<Integer> myArray = createTestArray(5,2,5,2,4,6);
		newPlayer.collect(myArray);		
		assertEquals(100, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneOneAndOneFive_OneFive() {
		List<Integer> myArray = createTestArray(5,1,4,2,4,6);
		newPlayer.collect(myArray);		
		assertEquals(150, s1.getTempScore());
	}
	
	@Test
	void testGetScoreTwoOneAndOneFive_OneFive() {
		List<Integer> myArray = createTestArray(5,1,1,2,4,6);
		newPlayer.collect(myArray);		
		assertEquals(250, s1.getTempScore());
	}
	
	@Test
	void testGetScoreOneOneAndTwoFives_OneFive() {
		List<Integer> myArray = createTestArray(5,1,5,2,4,6);
		newPlayer.collect(myArray);		
		assertEquals(200, s1.getTempScore());
	}
	
	private List<Integer> createTestArray(int i, int j, int k, int l, int m, int n) {
		List<Integer> myArray = new ArrayList<>();
		myArray.add(i);
		myArray.add(j);
		myArray.add(k);
		myArray.add(l);
		myArray.add(m);
		myArray.add(n);
		return myArray;
	}

}
