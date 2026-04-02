package chap01;

import java.util.Iterator;

public class For2Demo {

	public static void main(String[] args) {
		int row;
		for (row=2; row<10; row++) {
			int column;
			for (column=1; column<10; column++) {
			System.out.printf("%4d",row*column);
				
			}
			System.out.println();
		}
		
	}

}
