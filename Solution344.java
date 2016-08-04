package leetcode_algorithms;

public class Solution344 {
	    public String reverseString(String s) {
	        int left=0;
	        int right=s.length()-1;
	        char strChar[]= s.toCharArray();
	        while(left<right){
	            char temp;
	            temp = strChar[left];
	            strChar[left] = strChar[right];
	            strChar[right]=temp;
	            //strChar(left)=strChar(left)+strChar(right);
	            //strChar(right)=strChar(left)-strChar(right);
	            //strChar(left)=strChar(left)-strChar(right);
	            left++;
	            right--;
	        }
	        return new String(strChar);
	        }
}
