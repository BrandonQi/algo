package algo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public void findDup(int[] arr) {
    	Set<Integer> set = new HashSet<>();
    	for (int i = 0; i < arr.length; i++) {
    		if (!set.add(arr[i])) {
    			System.out.println(arr[i]);
    		}
    	}
    } 
    
    public void findDupArrIndex(int[] arr) {
    	//positive value
    	int max = -1;
    	for (int i = 0;i < arr.length;i ++) {
    		if (arr[i] > max) {
    			max = arr[i];
    		}
    	}
    	int[] markArr = new int[max + 1];
    	for (int i = 0;i < arr.length; i++) {
    		if (markArr[arr[i]] == -1) {
    			System.out.println(arr[i]);
    		} else {
    			markArr[arr[i]] = -1;
    		}
    	}
    }
    
    public void findDupBySort(int[] arr) {
    	Arrays.sort(arr);
    	int slow = 0;
    	int fast = 1;
    	while (fast < arr.length && slow < arr.length) {
    		if (arr[slow] == arr[fast]) {
    			System.out.println(arr[slow]);
    		}
			slow++;
			fast++;
    	}
    }
}