package algo;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AlgoTest {
	
    @Test
    public void algoTest() {
    }
    
    @Test
    public void compressStrTest() {
    		CompressString cs = new CompressString();
    		char[] input = {'a','a','b','b','c','c','c'};
    		System.out.println(cs.compress(input));
    }
    
    @Test
    public void findAllPrimeTest() {
    	int input1 = 10;
    	int input2 = 20;
    	System.out.println(FindAllPrime.findAllPrime(input1));
    	System.out.println(FindAllPrime.findAllPrime(input2));
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
    	assertEquals(3, CuttingRope.recusionCut(input2));
    }
    
    @Test
    public void reverseIntegerTest() {
    	System.out.println((-18) % 10);
    	System.out.println(ReverseInteger.reverseInteger(18));
    	assertEquals(81, ReverseInteger.reverseInteger(18));
    	System.out.println(ReverseInteger.reverseInteger(100));
    	assertEquals(1, ReverseInteger.reverseInteger(100));
    	System.out.println(ReverseInteger.reverseInteger(-123456));
    	assertEquals(-654321, ReverseInteger.reverseInteger(-123456));
    	System.out.println(ReverseInteger.reverseInteger(-1000000003));
    	assertEquals(-1, ReverseInteger.reverseInteger(-1000000003));
    }
    
    @Test
    public void largestSumSubArrTest() {
    	int[] input = {1, 2, 3, 4, -1, -2, -3, -4, 10, -1, -2, 6};
    	assertEquals(13, LargestSumSubArr.largestSumSubArr(input));
    }
    
    @Test
    public void reverseWordsTest() {
    	String input = "I love codding";
    	assertEquals("codding love I", ReverseWords.reverseWords(input));
    }
    
    @Test
    public void searchInSortedMatrixTest() {
    	int[][] matrix = {{1, 2, 3, 4}};
    	int target = 4;
    	int[] result = SearchInSortedMatrix.search2(matrix, target);
    	assertArrayEquals(new int[]{0,3}, result);
    }
    
	@Test
	public void testSplitToMap() {
		String input = "{iri=http://nxta.us/aml/Data/Preload#Rule-ira.PatternsToFundTransferAlertObj1, id=def8635a-3122-412a-9364-4ea814aedf66, label=Patterns of Fund Transfer}";
		Map<String, String> result = SplitToMap.splitToMap(input);
		System.out.println(result.get("label"));
	}
	@Test
	public void testFindDup() {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {20, 2, 4, 5, 2, 20, 1};
        System.out.println("method 1:");
        duplicate.findDup(arr);
        System.out.println("method 2:");
        duplicate.findDupArrIndex(arr);
        System.out.println("method 3:");
        duplicate.findDupBySort(arr);
	}
	@Test
	public void testFirstNonRepeatChar() {
		FirstNonRepeatChar fn = new FirstNonRepeatChar();
		char c = fn.firstNotRepeatingCharacter("abacabad");
		System.out.println(c);
	}
	@Test
	public void testCompen() {
		Compen fn = new Compen();
		int c = fn.getIntegerComplement(100);
		System.out.println(c);
	}
	@Test
	public void testSwitchEvenOdd() {
		SwitchEvenOdd fn = new SwitchEvenOdd();
		int[] c = fn.switchEvenOdd(new int[]{0,1,0,1,0});
		for (int i = 0;i < c.length;i++) {
			System.out.print(c[i] + " ");
		}
	}
	@Test
	public void testRainbow() {
		RainbowSort rb = new RainbowSort();
		int[] c = rb.rainbowSort(new int[]{1,1,1,1,1,1,0,0,0,0,1,1,1,1,-1,-1,-1,0,0,0});
		for (int i = 0;i < c.length;i++) {
			System.out.print(c[i] + " ");
		}
	}
}