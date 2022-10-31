package Method;

import java.util.*;

public class Page26 {
	public static void big(int a,int b) {
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
	
	public static int rest(int a, int b) {
		int c = a%b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		big(a,b);
		
		for(;;) {
		System.out.println("두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 == 0 || num2 == 0) break;
		int result =rest(num1,num2);
		System.out.println("나머지 연산 결과 : " +result);
		}
	}

}
