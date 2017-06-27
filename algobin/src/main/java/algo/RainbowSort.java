package algo;

public class RainbowSort {
	public int[] rainbowSort(int[] input) {
		if (input == null || input.length == 1) {
			return input;
		}
		int neg = 0;
		int zero = 0;
		int pos = input.length - 1;
		while (zero <= pos) {
			if (input[zero] == -1) {
				swap(input, zero, neg++);
			} else if (input[zero] == 0) {
				zero++;
			} else {
				swap(input, zero, pos--);
			}
		}
		return input;
	}
	
	public void swap(int[] input, int l, int r) {
		int temp = input[l];
		input[l] = input[r];
		input[r] = temp;
	}
}
