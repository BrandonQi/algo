package algo;

public class LargestSumSubArr {
	/*
	 * dp
	 * dp[i] : largest sum of the subarray ending in i
	 * base case : dp[0] = input[0]
	 * induction rule : dp[i] = Math.max(input[i], dp[i - 1] + input[i])
	 * time: o(N)
	 * space : O(1)
	 */
	public static int largestSumSubArr(int[] input) {
		//sanity check
		if (input == null || input.length == 0) {
			return -1;
		}
		
		int maxSumEndHere = input[0];
		int result = input[0];
		for (int i = 1;i < input.length;i++) {
			if (maxSumEndHere + input[i] > input[i]) {
				maxSumEndHere = maxSumEndHere + input[i];
			} else {
				maxSumEndHere = input[i];
			}
			if (result < maxSumEndHere) {
				result = maxSumEndHere;
			}
		}
		return result;
	}
}
