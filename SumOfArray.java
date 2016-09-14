package xiecheng;

import java.util.Scanner;
import java.math.*;
import java.text.*;
public class SumOfArray {
	public static double sumOfArray(double n, int m) {
		double sum = 0;
		for (int j = 0; j < m; j++) {
			sum += n;
			n=Math.sqrt(n);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int m = in.nextInt();
			//DecimalFormat df = new DecimalFormat(".##");
			//String st = df.format(sumOfArray(n, m));
			System.out.println(String.format("%.2f",sumOfArray(n, m) ));
			
		}
		
	}

}
