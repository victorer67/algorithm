package leetcode_algorithms;

public class TriangleNumber {

	public static int printNumber(int n) {
		if (n == 1) {
			return 1;
		} else
			return printNumber(n - 1) + n;
	}

	public static void main(String[] args) {

		System.out.println(printNumber(3));
	}

}
