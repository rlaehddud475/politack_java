package chap02.ex02;

class Printer3{
	private int numOfPapers=0;
	private boolean duplex;
	public Printer3(int numOfPapers, boolean duplex) {
		this.numOfPapers=numOfPapers;
		this.duplex=duplex;
	}
	public void print(int amount) {
	
	if (!duplex) {
		int lack=amount-numOfPapers;
		System.out.println("단면으로 모두 출력하려면 용지가 "+lack+"매 부족합니다."+ numOfPapers+"장만 출력합니다.");
		
	}else {
		int need = (amount+1)/2;
		numOfPapers-=need;
		System.out.println("양면으로 "+need+"장 출력했습니다."+ " 현재"+ numOfPapers+"장 남아 있습니다.");
	}
	
}
	public boolean getDuplex() {
		return duplex;
	}
	public void setDuplex(boolean duplex) {
	this.duplex= duplex;
		
	}

}
public class Printer3Test {

	public static void main(String[] args) {
		Printer3 p = new Printer3(20,true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);

	}

}
