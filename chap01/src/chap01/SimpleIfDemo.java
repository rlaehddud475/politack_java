package chap01;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		int num;
		String result;
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num=in.nextInt();
		
	if (num%2==0) {
		System.out.println("짝수!");
	}else {
		System.out.println("홀수!");
	}
	System.out.println("종료");
	if (num%2==0) {
		System.out.println("짝수!");
	}if (num%2==1) {
		System.out.println("홀수!");
	}
	System.out.println("종료");
	
	result=(num%2==0) ? "짝수":"홀수";
	System.out.println(result);
	System.out.println("종료");
	}

}
