package Practice5;

import java.util.*;

class Point{	
	int x;
	int y;
	public Point p;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}//class

class Circle{	
	private Point p; //= new Point
	private int r;

	//(1) 생성자
	Circle(Point p , int r){
		this.p = p;
		this.r = r;
	}



	//출력 메서드
	public void printInfo(){
		System.out.println("x= " + p.x);
		System.out.println("x= " + p.y);
		//(2) x, y 출력

		System.out.println("r=" + r+"\n");
	}
}//class

class HasaTest3{
	public static void main(String[] arg){
		//(3) Circle 객체 생성후 printInfo() 메서드 호출
		Point p = new Point(3,4);
		
		Circle cir = new Circle(p.p , 20);
		cir.printInfo();
		

	}
}


