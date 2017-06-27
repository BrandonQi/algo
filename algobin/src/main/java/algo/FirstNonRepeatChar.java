package algo;

public class FirstNonRepeatChar {
	char firstNotRepeatingCharacter(String s) {
	    if (s == null || s.length() == 0) {
	        return '_';
	    }
	    int[] flags = new int[52];
	    for (int i = 0; i < s.length(); i++) {
	    	char c = s.charAt(i);
	    	int index = c - 'a';
	    	if (flags[index] == 0) {
	    		flags[index] = i + 1;
	    	} else if (flags[index] > 0 ) {
	    		flags[index] = -flags[index];
	    	}
	    }
	    int min = s.length();
	    for (int i = 0; i < 52; i++) {
	    	if (flags[i] > 0 && flags[i] - 1 < min) {
	    		min = flags[i] - 1;
	    	}
	    }
	    if (min == s.length()) {
	    	return '_';
	    } else { 
	    	return s.charAt(min);
	    }
	}
}
