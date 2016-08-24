package leetcode_algorithms;

public class Solution88 {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
     	for (int j = 0, i=m; j < n; i++,j++) {
				nums1[i] = nums2[j];
			}
		
		for (int i = 0; i < m + n; i++) {
			for (int j = 0; j < m + n - i-1; j++) {
				if (nums1[j] > nums1[j+1]) {
					int temp;
					temp = nums1[j];
					nums1[j] = nums1[j+1];
					nums1[j+1] = temp;
				}
			}
		}
 }



}
