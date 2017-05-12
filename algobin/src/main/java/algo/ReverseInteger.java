package algo;

public class ReverseInteger {
	public static int reverseInteger(int input) {
		int flag = 1;
		int result = 0;
		if (input < 0) {
			flag = -1;
			input = -input;
		}
		
		while (input > 0) {
			int lastDigit = input % 10;
			int tempResult = result * 10 + lastDigit;
			//check overflow
			if ((tempResult - lastDigit)/10 != result) {
				return -1;
			}
			result = tempResult;
			input = input / 10;
		}
		return flag * result;
	}
}
