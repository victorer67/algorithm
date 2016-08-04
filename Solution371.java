package leetcode_algorithms;

public class Solution371 {

	public static int getSum(int a, int b) {
		while (b != 0) {
			int c=a&b;//逻辑与运算 取相同位
			a^=b;//逻辑异或运算，取不同位
			b=c<<1;//逻辑左移1位
		}
		return a;
	}

	public static void main(String[] args) {
		int a = 9, b = 8;
		/*int c=a&b;
		a^=b;
		b=c<<1;
		System.out.println(c+" "+a+" "+b+" ");
		 c=a&b;
		a^=b;
		b=c<<1;
		System.out.println(c+" "+a+" "+b+" ");
		 c=a&b;
		a^=b;
		b=c<<1;
		System.out.println(c+" "+a+" "+b+" ");
		c=a&b;
		a^=b;
		b=c<<1;
		System.out.println(c+" "+a+" "+b+" ");*/
		System.out.println(getSum(a,b));
	}

}
