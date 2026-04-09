package chap01;

import java.util.Scanner;

public class Fact2Demo {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int result;
		int n;
	System.out.print("팩토리얼 값을 구할 정수 : ");
		n=in.nextInt();
		result=factorial(n);
		System.out.println(result);
	}
	  static int factorial(int x) {
	    	int r= 1;
	    	while(true) {
	    		if(x>0) {
	    			r*=x--;
	    		}else {
					break;
				}
	    	}
	    	return r;
	    }
}
