package leetcode_algorithms;

public class Solution1 {
	public static int[] twoSum(int[] nums, int target) {
		int[] index = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length-1; j>=0&&j!=i; j--) {
				if (target == nums[i] + nums[j]) {
					index[0]=i;
					index[1]=j;
				}
			}
		}
		for(int i =0;i<2;i++){
			System.out.print(index[i]+" ");
		}
		return index;
	}

	public static void main(String[] args) {
		int[] nums = { 0,4,3,0 };
		int target = 0;
		twoSum(nums, target);
	}

}
