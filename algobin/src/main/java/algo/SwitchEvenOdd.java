package algo;

public class SwitchEvenOdd {
	public int[] switchEvenOdd(int[] input) {
		if (input == null || input.length == 1) {
			return input;
		}
		int head = 0;
		int tail = input.length - 1;
		while (head < tail) {
			if (input[head] == 1 && input[tail] == 0) {
				int temp = input[head];
				input[head] = input[tail];
				input[tail] = temp;
			} else if (input[head] == 0) {
				head++;
			} else if (input[tail] == 1) {
				tail--;
			}
		}
		return input;
	}
}
