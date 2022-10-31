package Method;

import java.util.*;

public class Page23 {
	public static void test1() {
		System.out.println("hello java");
	}
	
	public static void test2(int n) {
		for(int i=0;i<n;i++) {
		System.out.println("hello java");
		}
	}
	
	public static int test3() {
		int sum = 0;
		for(int i=1;i<101;i+=2) {
			sum+=i;
		}
		return sum;
	}
	
	public static float test4(float a , float b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		System.out.println("실습1");
		test1();
		
		System.out.println("\n실습2");
		int n =3;
		test2(n);
		
		int sum=test3();
		System.out.println("\n실습3");
		System.out.println("1~100까지 홀수의 합 = " + sum);
		
		float a = 3.14f;
		float b = 3.15f;
		
		float result = test4(a,b);
		System.out.println("\n실습4");
		System.out.println(a + "*" + b + "=" +result);
	}

}
