package algo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
	public int[] kSmallest(int[] array, int k) {
		//sanity check
		if (array == null || array.length == 0 || k == 0) {
			return new int[0];
		}
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer t, Integer h) {
				if (t.equals(h)) {
					return 0;
				}
				return h > t ? 1 : -1;
			}
		});
		
		for (int i = 0; i < array.length; i++) {
			if (i < k) {
				maxHeap.offer(array[i]);
			} else {
				if (array[i] < maxHeap.peek()) {
					maxHeap.poll();
					maxHeap.offer(array[i]);
				}
			}
		}
		
		int[] result = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			result[i] = maxHeap.poll();
		}
		
		return result;
	}
}
