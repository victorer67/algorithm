package xiecheng;

import java.util.*;
import java.math.*;

public class Shuixianhua {
	/******** Ë®ÏÉ»¨ ***********/
	public static void shuixiaohua(int a, int b) {
		int flag = 0;
		for (int i = a; i <= b; i++) {
			double temp = Math.pow(i % 10, 3) + Math.pow(i % 100 / 10, 3) + Math.pow(i / 100, 3);
			if (i == temp) {
				flag = 1;
				System.out.print((int) temp + " ");
			}
		}
		if (flag == 0) {
			System.out.println("no");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println();
			shuixiaohua(a, b);
		}

	}

}
