package practice2;

import java.util.*;

public class Page30 {
	public static double bonus(int a , int b) {
		double result = 0;
		if(a>=200) {
			result = b*0.3;
		}else if(a>=100) {
			result = b*0.2;
		}else {
			result = b*0.1;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("판매수량과 판매금액을 적으시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double bonus =bonus(a,b);
		System.out.println("성과급 : " + bonus);


	}

}
