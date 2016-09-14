package oj_platform;

import java.util.*;
import java.util.regex.*;

public class PatternMatcher {
	/**********ÕıÔòÆ¥Åä**************/
	public static void patternMatcher(String pattern, String args) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(args);
		while(m.find()) {
			System.out.println(m.group());
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String input = in.nextLine();
			String s = "[24680]A[13579]{2}";
			patternMatcher(s, input);
		}
		in.close();
	}
}
