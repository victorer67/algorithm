package oj_platform;

public class CircleRightMove {
	public static String move(String s,int n){
		StringBuffer sb = new StringBuffer();
		sb.append(s.substring(n));
		sb.append(s.substring(0, n));
		return sb.toString();
	}
	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(move(s,2));

	}

}
