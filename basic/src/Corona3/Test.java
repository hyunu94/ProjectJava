package Corona3;

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
	private int lon,high;
	
	Rectangle(int lon,int high){
		this.lon = lon;
		this.high = high;
	}
	
	public double findArea() {
		return lon*high;
	}
}
public class Test {
	public static void main(String [] args) {
		System.out.println("도형을 선택하세요 <1.원 2.사각형>");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Shape sh = null;
		
		if(choice==1) {
			System.out.println("반지름 입력!");
			double r = sc.nextDouble();
			sh = new Circle(r);
			System.out.println("면적 : " + sh.findArea());
		}else if(choice==2) {
			System.out.println("가로,세로 입력!");
			int lon = sc.nextInt();
			int high = sc.nextInt();
			sh = new Rectangle(lon, high);
			System.out.println("면적 : " + sh.findArea());
		}else {
			System.out.println("잘못 입력했습니다");
			return;
		}
	}
}
