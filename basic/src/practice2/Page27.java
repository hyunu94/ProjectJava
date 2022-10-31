package practice2;

import java.util.*;

public class Page27 {
	public static int tocm(float a) {
		int b = (int)(a*2.54);
		return b;
	}
	
	public static float toinch(int a) {
		float b = a/2.54f;
		return b;
	}
	
	public static double area(int a , int b) {
		double d = (a*b)/2;
		return d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("변환하려는 inch를 입력하세요");
		float num1 = sc.nextFloat();
		int change1= tocm(num1);
		System.out.println(num1 + "=> " + change1);
		System.out.println("변환하려는 cm를 입력하세요");
		int num2 = sc.nextInt();
		float change2= toinch(num2);
		System.out.println(num2 + "=> " + change2);
		
		System.out.println("삼각형의 밑변의 길이,높이를 입력하세요");
		int lon = sc.nextInt();
		int high = sc.nextInt();
		double d =area(lon,high);
		System.out.println("삼각형의 면적 : " +d);
		

	}

}
