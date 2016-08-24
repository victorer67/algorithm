package leetcode_algorithms;

public class Solution27 {
	public static int removeElement(int[] nums, int val) {
		int left = 0;
		int right = nums.length - 1;
		int length = nums.length;
		if(length==1&&nums[left]==val){
			length--;
			return length;
		}
		while(true){
			while(left<=length-1&&nums[left]!=val){
				left++;
			}
			while(right>0&&nums[right]==val){
				right--;
				length--;
			}
			if(left<right){
				nums[left++]=nums[right--];
				length--;
			}else{
				break;
			}	
		}
		return length;
	}

	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(removeElement(nums, 1));
	}

}
