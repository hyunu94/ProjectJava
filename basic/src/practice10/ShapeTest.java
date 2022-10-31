package practice10;

import java.util.*;

abstract class Shape{
	public abstract void draw();
}

class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그립니다");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("사각형을 그립니다");
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요 <1.원 , 2.사각형>");
		int type = sc.nextInt();
		Shape sh = null;
		
		switch(type) {
			case 1 :
			sh = new Circle();
			break;
			
			case 2 :
			sh = new Rect();
			break;
		}
		sh.draw();
	}

}
