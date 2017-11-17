package algo;

public class TweakedBinaryTrees {
	public boolean isTweakedBinaryTrees(TreeNode one, TreeNode two) {
		if (one == null && two == null) {
			return true;
		} else if (one == null || two == null) {
			return false;
		} else if (one.key != two.key) {
			return false;
		}
		
		return (isTweakedBinaryTrees(one.left, two.left) && isTweakedBinaryTrees(one.right, two.right)) 
				|| (isTweakedBinaryTrees(one.left, two.right) && isTweakedBinaryTrees(one.right, two.left));
	}
}

