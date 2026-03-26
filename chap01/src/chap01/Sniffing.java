package chap01;

import java.util.Scanner;

public class Sniffing {

	public static void main(String[] args) {
		int num;
		String result;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num=in.nextInt();
		
		result=(num%2==0) ? "짝수":"홀수";
		System.out.println(result);
	}

}
