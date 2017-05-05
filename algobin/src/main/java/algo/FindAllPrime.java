package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPrime {
	public static List<Integer> findAllPrime(int input) {
		List<Integer> result = new ArrayList<>();
		//sanity check
		if (input < 1) {
			return result;
		}
		
		boolean[] isPrime = new boolean[input + 1];
		Arrays.fill(isPrime, true);
		
		for (int i = 2; i <= input; i++) {
			if (isPrime[i] == true) {
				int multiNum = 2;
				while (i * multiNum <= input) {
					isPrime[i * multiNum] = false;
					multiNum++;
				}
			}
		}
		
		for (int i = 1;i <= input; i++) {
			if (isPrime[i] == true) {
				result.add(i);
			}
		}
		return result;
	}
}
