package chap01;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
 int a,b,c, total;
 Scanner in = new Scanner(System.in);
 System.out.print("전공 이수 학정 : ");
 a=in.nextInt();
 System.out.print("교양 이수 학정 : ");
 b=in.nextInt();
 System.out.print("일반 이수 학정 : ");
 c=in.nextInt();
 total=a+b+c;
 if(total>=140&&a>=70&&b>=30&&c>=30||(b+c)>=80) {
	System.out.println("졸업 가능");
	 
 }else {
	System.out.println("졸업 불가");
}
	}

}
