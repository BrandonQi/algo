package algo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlgoTest {
	
    @Test
    public void algoTest() {
    }
    
    @Test
    public void longestAscSubArrTest() {
    	int[] input1 = {7, 2, 3, 1, 5, 8, 9, 6};
    	int[] input2 = {1, 2, 3, 3, 4, 4, 5};
    	assertEquals(4, LongestAscSubArr.longestAscSubArr(input1));
    	assertEquals(3, LongestAscSubArr.longestAscSubArr(input2));
    }
    
    @Test
    public void recusionCutTest() {
    	int input1 = 12;
    	int input2 = 5;
    	assertEquals(81, CuttingRope.recusionCut(input1));
    	assertEquals(6, CuttingRope.recusionCut(input2));
    }
}