package class5;

import java.util.*;

class Rectangle1{
	int a,b;
	
	public int area() {
		return a*b;
	}
	
	public int length() {
		return 2*(a+b);
	}
}

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 가로, 세로를 입력하세요");
		int lon = sc.nextInt();
		int high = sc.nextInt();
		
		Rectangle1 rec = new Rectangle1();
		rec.a = lon;
		rec.b = high;
		
		int area = rec.area();
		int lenght = rec.length();
		
		System.out.println("사각형의 넓이 : " + area + "\n사각형의 둘레 : " + lenght);
	}

}
