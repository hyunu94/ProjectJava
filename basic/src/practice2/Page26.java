package practice2;

import java.util.*;

public class Page26 {
	public static int big(int a , int b) {
		int result = 0;
		if(a>b) {
			result = a;
		}else {
			result = b;
		}
		return result;
	}
	
	public static double rest(int a , int b) {
		int c= 0;
			c=a%b;
		return c;			
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result =big(a,b);
		System.out.println("더 큰수는 " + result);
		
		for(;;) {
		System.out.println("\n두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		double result2=rest(num1,num2);
		System.out.println(result2);
		if(num1==0 || num2==0) break;
		}
	}

}
