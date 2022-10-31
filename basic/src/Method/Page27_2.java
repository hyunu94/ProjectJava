package Method;

import java.util.*;

public class Page27_2 {
	public static int area(int a, int b) {
		int c = (a*b)/2;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변의 길이, 높이를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=area(a,b);
		System.out.println(c);



	}

}
