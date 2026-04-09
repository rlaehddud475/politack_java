package chap01;

import java.util.Scanner;

public class Fact3Demo {

	public static void main(String[] args) {
	System.out.println(factorial(5));
	System.out.println(factorial(1,5));
	System.out.println(factorial(3,5));
	System.out.println(factorial(10,5));
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
	  static int factorial(int x, int y) {
	    	int r= 1;
	    	while(true) {
	    		if(x<=y) {
	    			r*=x++;
	    		}else {
					break;
				}
	    	}
	    	return r;
	    }
}
