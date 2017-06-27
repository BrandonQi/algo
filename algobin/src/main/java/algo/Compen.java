package algo;

public class Compen {
	 int getIntegerComplement(int n) {
		int result = 0;
		int shiftBits = 0;
		while (n > 0) {
			if ((n & 1) == 0) {
				result = (1 << shiftBits) | result;
			}
			shiftBits++;
			n = n >> 1;
		}
        
        return result;
    }
}

//0101