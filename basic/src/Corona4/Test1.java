package Corona4;

import java.util.*;

public class Test1 {
	public static double sum(double a , double b){
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println("두 실수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		try {
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("덧셈 연산 결과 : " + sum(num1,num2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.printStackTrace());
		}
		
		System.out.println("두 수를 입력하세요");
		
		
		
	}
	
	
	
	
}
