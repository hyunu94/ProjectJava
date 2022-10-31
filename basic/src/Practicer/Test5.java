package Practicer;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("두 실수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		try {
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("덧셈 연산 결과 : " + (a+b));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("두 수를 입력하세요");
		try {
			int n = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println(n%n2);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
