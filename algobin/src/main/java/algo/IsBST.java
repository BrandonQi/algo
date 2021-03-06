package algo;

public class IsBST {
	public boolean isBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		
		return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public boolean helper(TreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.key <= min) {
			return false;
		}
		if (root.key >= max) {
			return false;
		}
		
		return helper(root.left, min, root.key)
				&& helper(root.right, root.key, max);
	}
}
