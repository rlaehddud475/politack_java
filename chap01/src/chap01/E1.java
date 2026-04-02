package chap01;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
	int x ,result;
	Scanner in = new Scanner(System.in);
	System.out.print("정수를 입력하세요 : ");
	x=in.nextInt();

	result = x*x;
	System.out.println(x+"의 재곱은"+result);


	}

}
