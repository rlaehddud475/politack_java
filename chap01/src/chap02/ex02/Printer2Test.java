package chap02.ex02;

class Printer2{
	private int numOfPapers=0;
	public Printer2 (int numOfPapers) {
	 this.numOfPapers=numOfPapers;
	 
	}
	public void print(int amount) {
		int minus1 = numOfPapers-amount;
		if (numOfPapers == 0) {
	        System.out.println("용지가 없습니다.");
	    } 
		else if (numOfPapers>amount) {
		System.out.println(amount+"장 출력했습니다."+ "현재 "+ minus1 + "장 남았습니다.");
		numOfPapers-=amount;
		}else {
		int minus2 = amount-numOfPapers;
		System.out.println("모두 출력하면 용지가 " + minus2 + "장 부족합니다 " +numOfPapers + "장만 출력합니다");
		numOfPapers-=numOfPapers;
	}
}
}
public class Printer2Test {

	public static void main(String[] args) {
		Printer2 p = new Printer2(10);
		p.print(2);
		p.print(20);
		p.print(10);

	}

}
