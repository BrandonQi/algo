package algo;

/*
 * DP
 * arrLength[i] : length of the longest asc sub arr ending at position i;
 * base case : arrLength[0] = 1;
 * induction rule : arrLength[i] = input[i] > input[i - 1] ? arrLength[i] + 1 : 1.
 * time = O(n)
 * space = O(1)
 */
public class LongestAscSubArr {
	public static int longestAscSubArr(int[] input) {
		//sanity check
		if (input == null || input.length == 0) {
			return 0;
		}
		
		//base case
		int iMaxLength = 1;
		int max = 1;
		
		//induction
		for (int i = 1; i < input.length; i++) {
			if (input[i] > input[i - 1]) {
				iMaxLength = iMaxLength + 1;
			} else {
				iMaxLength = 1;
			}
			max = Math.max(max, iMaxLength);
		}
		return max;
	}
}
