package algo;

public class CompressString {
    public int compress(char[] chars) {
    		int compEnd = -1;
    		int ptr = 0;
    		while (ptr < chars.length) {
    			//count
    			int ptr1 = ptr;
    			while (ptr1 < chars.length && chars[ptr1] == chars[ptr]) {
    				ptr1++;
    			}
    			int count = ptr1 - ptr;
    			
    			//insert
    			compEnd++;
    			chars[compEnd] = chars[ptr];
    			if (count > 1) {
    				char[] digits = String.valueOf(count).toCharArray();
    				for (char digit : digits) {
    					compEnd++;
    					chars[compEnd] = digit;
    				}
    			}
    			
    			//move ptr
    			ptr = ptr1;
    		}
    		
    		return compEnd + 1;
    }
}
