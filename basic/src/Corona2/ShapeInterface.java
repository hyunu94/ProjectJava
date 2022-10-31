package Corona2;

import java.util.*;

interface Shape{
	public abstract double findArea();
}

class Circle implements Shape{
	private double r;
	
	Circle(double r){
		this.r = r;
	}
	
	public double findArea() {
		return r*r*3.14;
	}
}

class Rectangle implements Shape{
	private int w , h;
	
	Rectangle(int w,int h){
		this.w = w;
		this.h = h;
	}
	
	public double findArea() {
		return w*h;
	}
}
public class ShapeInterface {
	public static void main(String[] args) {
		System.out.println("도형을 선택하세요<1.원 2.사각형>");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Shape sh = null;
		
		if(choice == 1) {
			System.out.println("반지름 입력");
			double r = sc.nextDouble();
			sh = new Circle(r);
			System.out.println("면적 : " + sh.findArea());
		}else if(choice == 2) {
			System.out.println("가로,세로 입력");
			int w = sc.nextInt();
			int h = sc.nextInt();
			sh = new Rectangle(w, h);
			System.out.println("면적 : " + sh.findArea());
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
	}

}
