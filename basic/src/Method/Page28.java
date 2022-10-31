package Method;

import java.util.*;

public class Page28 {
	
	public static String year(int a) {
		String result = "";
		if(a%400 == 0 || (a%4==0 && a%100!=0)) {
			result = "윤년";
		}else {
			result = "평년";
		}
		return result;
	}
	
	public static String two(int a) {
		String result = "";
		if(a==0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		return result;
	}
	
	public static String gender(int a) {
		String result = "";
		if(a==1 || a==3) {
			result = "남자";
		}else {
			result = "여자";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = sc.nextInt();
		String result = year(year);
		
		System.out.println(result);
		
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		String result2=two(n);
		
		System.out.println(result2);
		
		System.out.println("성별 자리 앞번호를 입력하세요");
		int gender = sc.nextInt();
		String result3 =gender(gender);
		
		System.out.println(result3);
	}
	
	

}
