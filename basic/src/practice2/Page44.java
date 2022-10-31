package practice2;

import java.util.*;

public class Page44 {
	public static int area(int a , int b) {
		int c = a*b;
		return c;
	}
	
	public static double area(double a) {
		double c = a*a*3.14;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 , 세로 , 반지름을 입력하세요");
		int lon = sc.nextInt();
		int high = sc.nextInt();
		double half = sc.nextDouble();
		int result =area(lon,high);
		double result2=area(half);
		System.out.println("사각형의 면적 : " + result + "\n원의 면적 : " + result2);

	}

}
