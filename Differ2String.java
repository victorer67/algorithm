package huawei;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Differ2String {
	
	/***** 删除公共部分并去掉重复的 *************/
	public static String differ(String str1, String str2) {
		char[] strToChar1 = str1.toCharArray();
		char[] strToChar2 = str2.toCharArray();
		LinkedList<Character> list = new LinkedList<Character>();
		for (Character str : strToChar1) {
			if (!list.contains(str)) {
				list.add(str);
			}
		}
		for (Character strc : strToChar2) {
			if (list.contains(strc)) {
				list.remove(strc);
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
	
	public static String differ2(String str1, String str2){
		char[] strToChar2 = str2.toCharArray();
		for(int i= 0;i<strToChar2.length;i++){
			str1=str1.replace(strToChar2[i],' ');
		}	
		str1 =str1.replace(" ", "");
		return str1.toString();
	}
	

		/****** 给字符串去重 ***********************/
	public static String deleteRepeat(String str) {
		String[] strToChar = str.split("");
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < strToChar.length; i++) {
			if (!list.contains(strToChar[i]))
				list.add(strToChar[i]);
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str1 = "abcda";
		String str2 = "ac";
		System.out.println(differ2(str1,str2));
		//deleteRepeat(str1);
		//deleteRepeat(str2);
		// differ(str1,str2);
		//System.out.println(differ(deleteRepeat(str1), deleteRepeat(str2)));
	}

}
