package Method;

import java.util.*;

public class Page44 {
	public static int area(int a, int b) {
		int c = (a*b)/2;
		return c;
	}
	
	public static double area(double a) {
		double c = a*a*3.14;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 , 세로, 반지름을 입력하세요");
		int lon = sc.nextInt();
		int high = sc.nextInt();
		double half = sc.nextDouble();
		
		int area =area(lon,high);
		double area2 = area(half);
		System.out.println("사각형의 면적 : " + area + "\n원의 면적 : " +area2);
	}

}
