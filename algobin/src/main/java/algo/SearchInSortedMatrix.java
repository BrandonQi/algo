package algo;

public class SearchInSortedMatrix {
	public static int[] search1(int[][] matrix, int target) {
		int[] result = new int[]{-1, -1};
		//sanity check
		if (matrix == null) {
			return result;
		}

		//2d -> 1d
		int rowNum = matrix.length;
		int colNum = matrix[0].length;
		int left = 0;
		int right = rowNum * colNum - 1;

		//binary search
		while (left <= right) {
			int mid = left + (right - left) / 2;
			//1d -> 2d
			int row = mid / colNum;
			int col = mid % colNum;
			if (matrix[row][col] == target) {
				result[0] = row;
				result[1] = col;
				return result;
			} else if (matrix[row][col] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}
	
	public static int[] search2(int[][] matrix, int target) {
		int[] result = new int[]{-1, -1};
		if (matrix == null) {
			return result;
		}
		
		//search row
		int left = 0;
		int right = matrix.length - 1;
		while (left < right - 1) {
			//stop when left + 1 == right
			int mid = left + (right - left) / 2;
			if (matrix[mid][0] == target) {
				result[0] = mid;
				result[1] = 0;
				return result;
			} else if (matrix[mid][0] > target) {
				right = mid;
			} else {
				left = mid;
			}
		}
		//post processing
		if (matrix[left][0] > target) {
			return result;
		} else if (matrix[right][0] > target) {
			result[0] = left;
		} else {
			result[0] = right;
		}
		//search column
		left = 0;
		right = matrix[0].length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (matrix[result[0]][mid] == target) {
				result[1] = mid;
				return result;
			} else if (matrix[result[0]][mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		result[0] = -1;
		return result;
	}
}
