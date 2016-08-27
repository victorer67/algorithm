package leetcode_algorithms;

public class Solution58 {
	public static int lengthOfLastWord(String s) {
		String ss = s.trim();
		return ss.length() - 1 - ss.lastIndexOf(' ');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello ";
		System.out.println(lengthOfLastWord(s));
	}

}
