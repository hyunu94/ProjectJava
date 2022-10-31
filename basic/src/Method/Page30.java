package Method;

import java.util.*;

public class Page30 {
	public static double bonus(int a, int b) {
		double bonus = 0.0;
		if(a>=200) {
			bonus = b*0.3;
		}else if(a>=100) {
			bonus = b*0.2;
		}else {
			bonus = b*0.1;
		}
		return bonus;
	}
	
	public static boolean judge(String s) {
		boolean bool = true;
		String result = "";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch >= '0' && ch <= '9')) {
				bool = false ;
				break;
			}
		}
		return bool;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("판매수량, 판매금액을 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double bonus=bonus(a,b);
		System.out.println("성과급 : " + bonus );
		
		sc.nextLine();
		System.out.println("값을 입력하세요");
		String what = sc.nextLine();
		String result = "";
		boolean bool = judge(what);
		if(bool == true) {
			result = "숫자입니다";
		}else {
			result = "숫자가 아닙니다";
		}
		System.out.println(what + result);
	}

}
