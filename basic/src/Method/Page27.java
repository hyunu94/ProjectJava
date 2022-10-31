package Method;

import java.util.*;

public class Page27 {
	public static double tocm(int n) {
		double result = (double)n*2.54;
		return result;
	}
	
	public static double toinch(int n2) {
		double result2 = (double)n2/2.54;
		return result2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("변환하려는 inch를 입력하세요");
		int n = sc.nextInt();
		double result = tocm(n);
		System.out.println(result);
		
		System.out.println("변환하려는 cm를 입력하세요");
		int n1 = sc.nextInt();
		double result2 = toinch(n1);
		System.out.println(result2);
	}

}
