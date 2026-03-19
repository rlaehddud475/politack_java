package chap01;

public class PrintfDemo {

	public static void main(String[] args) {
		int i = 97;
		String str="Java";
		double f= 3.14f;
		System.out.printf("%d\n",i);
		System.out.printf("%o\n",i);
		System.out.printf("%x\n",i);
		System.out.printf("%c\n",i);
		System.out.printf("%5d\n",i);
		System.out.printf("%-5d\n",i);
		System.out.printf("%s\n",str);
		System.out.printf("%5s\n",str);
		System.out.printf("%-5s\n",str);
		System.out.printf("%f\n",f);
		System.out.printf("%e\n",f);
		System.out.printf("%4.1f\n",f);
		System.out.printf("%04.1f\n",f);
		System.out.printf("%-4.1f\n",f);


	}

}
