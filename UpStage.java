package oj_platform;

import java.util.Scanner;

public class UpStage {
	public static int upstage(int m){
		if(m==1){
			return 0;
		}
		else if(m==2){
			return 1;
		}
		else if(m==3){
			return 2;
		}
			return upstage(m-1)+upstage(m-2);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();//输入n行数据
			for(int i  = 0;i<n;i++){
				System.out.println(upstage(in.nextInt()));
			}
		}

	}

}
