package chap01;

class Circle {
	double radius;
	String color;

	public Circle(double r,String c) {
		radius = r;
		color=c;

	}
	public Circle(double r) {
		radius = r;
		color="파랑";

	}
	public Circle(String c) {
		radius = 10.0;
		color=c;

	}
	public Circle() {
		radius = 10.0;
		color="빨강";

	}
//	public double getRadius() {
//		return radius;
//	}
//
//	public void setRadius(double r) {
//		this.radius = r;
//	}
//
//	double findArea() {
//		return 3.14 * radius * radius;
//	}
//
//	void show(double x, double y) {
//		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
//	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0,"빨강");
		Circle c2= new Circle(10.0);
		Circle c3 = new Circle(10.0,"노랑");
		Circle c4 = new Circle();
//		myCircle.setRadius(10.0);
//		myCircle.show(myCircle.getRadius() , myCircle.findArea());

	}

}
