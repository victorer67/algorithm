package leetcode_algorithms;

public class Solution345{
	public static String reverseVowels(String str) {
		char[] s = str.toCharArray();
		int left = 0;
		int right = s.length-left - 1;
		while (left < right) {
		    while(left<right&&!isvowel(s[left])){
		       left++; 
		    }
		     while(left<right&&!isvowel(s[right])){
		       right--; 
		    }
			if (left<right) {
				char temp;
				temp=s[left];
				s[left]=s[right];
				s[right]=temp;
			}
			left++;
			right--;
		}
		return new String(s);
	}
	public static boolean isvowel(char a) {
		String vowel =  "aeiouAEIOU";
		for (int i = 0; i < vowel.length(); i++) {
			if (a == vowel.charAt(i)) {
				return true;
			}
		}
			return false;
	}
	public static void main(String[] args) {
		String name = "leetcode";
		String reverseName = reverseVowels(name);
		System.out.println("--------");
		System.out.println(reverseName);
	}
}
