package algo;

public class ReverseWords {
	public static String reverseWords(String input) {
	    //sanity check
	    if (input == null || input.length() < 2) {
	      return input;
	    }
	    
	    //convert string to char array -> constant space
	    char[] charArr = input.toCharArray();
	    
	    //reverse the whole string
	    reverse(charArr, 0, charArr.length - 1);
	    
	    //reverse each words
	    int start = 0;
	    for (int i = 0; i < charArr.length; i++) {
	      //assume there is no leading or tailing space
	      if (charArr[i] != ' ' && (i == 0 || charArr[i - 1] == ' ')) {
	        //i is the index of the beginning of a word
	        start = i;
	      } else if (charArr[i] != ' ' && (i == charArr.length - 1 || charArr[i + 1] == ' ')) {
			//i is the index of the beginning of a word
			reverse(charArr, start, i);
	      }
	    }
	    
	    return new String(charArr);
	}
		
	private static void reverse(char[] input, int left, int right) {
	  while (left < right) {
	    char temp = input[left];
	    input[left] = input[right];
	    input[right] = temp;
	    left++;
	    right--;
	  }
	}
}
