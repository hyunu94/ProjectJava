package Method;

import java.util.*;

public class Page52 {
	public static String grade(int a, int b) {
		String result = "";
		if(a>=20 && b<=0) {
			result = "우수회원";
		}else {
			result = "일반회원";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("거래횟수와 연체회수를 작성하세요");
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		String result = grade(n,n1);
		System.out.println(result);
	}

}
