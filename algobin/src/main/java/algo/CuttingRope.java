package algo;

import java.util.ArrayList;
import java.util.List;

public class CuttingRope {
	public static int recusionCut(int input) {
		//sanity check 
		if (input < 2) {
			return 0;
		}
		return recursionHelper(input);
	}
	
	public static int recursionHelper(int leftLength) {
		//base case
		if (leftLength <= 1) {
			return 0;
		}
		//recursion rule
		int max = 0;
		for (int i = 1; i < leftLength; i++) {
			int best = Math.max(leftLength - i, recursionHelper(leftLength - i));
			max = Math.max(max, i * best);
		}
		return max;
	}
}
