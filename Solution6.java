package leetcode_algorithms;

public class Solution6 {
	public static String convert(String s, int numRows) {
		int len = s.length();
		int size = 2 * numRows - 2;
		if (s == null || len == 0 && numRows < 0) {
			return "";
		}
		if (numRows == 1) {
			return s;
		}
		StringBuffer res = new StringBuffer();//注意StringBuffer与String的区别
		for (int i = 0; i < numRows; i++) {
			for (int j = i; j < len; j += size) {
				res.append(s.charAt(j));
				if(i !=0 && i != numRows-1){//如果不是第一行和最后一行
					int temp = j+size-2*i;
					if(temp <s.length())
							res.append(s.charAt(temp));
				}
				}
			}
		return res.toString();
	}

	public static void main(String[] args) {
		String s = "abcdefghijklmn";
		System.out.println(convert(s, 3));
	}
}
