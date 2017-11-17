package algo;

import java.util.ArrayList;
import java.util.List;

public class GetKeysInBST {
	public List<Integer> getRange(TreeNode root, int min, int max) {
		List<Integer> result = new ArrayList<>();
		
		return result;
	}
	
	public void helper(TreeNode root, int min, int max, List<Integer> result) {
		if (root == null) {
			return;
		}
		
		if (root.key > min) {
			helper(root.left, min, max, result);
		}
		
		if (root.key >= min && root.key <= max) {
			result.add(root.key);
		}
		
		if (root.key < max) {
			helper(root.right, min, max, result);
		}
	}
}
