package remember;

import java.util.*;

public class test1 {
	public static void main(String[] args) {
		System.out.println("Bye, C");
		System.out.println();
		System.out.println("Bye, C++");
		System.out.println();
		System.out.println("Hello, Java!");
		
		System.out.print("이름 : 홍길동,");
		System.out.print("나이 : 20");
		
		String name = "홍길동";
		int age = 20;
		String tel = "010-100-2000";
		String adress = "당산동";
		
		System.out.println("이름 : " + name + ", 나이 : " + age);
		System.out.println("전화번호 : " + tel + ", 주소 : " + adress);
		
		System.out.println("<따옴표 사용>");
		System.out.println("그는 말했다.\"나는 java가 재밌어!\"");
		System.out.println("그는 말했다.\t나도 java가 재밌어!\n");
		System.out.println("<역슬래시 사용>");
		System.out.println("c:\\download\\test.tex");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 넓이를 입력하세요 : ");
		int reng = sc.nextInt();
		System.out.print("사각형의 높이를 입력하세요 : ");
		int high = sc.nextInt();
		System.out.println(reng);
		System.out.println(high);
		System.out.println(reng*high);
		
		System.out.print("지방의 그램을 입력하세요");
		int fat = sc.nextInt();
		System.out.print("탄수화물의 그램을 입력하세요");
		int carbophydrate = sc.nextInt();
		System.out.print("단백질의 그램을 입력하세요");
		int protein = sc.nextInt();
		
		System.out.println("총 칼로리 : " + (fat * 9 + carbophydrate * 4 + protein * 4));
	}
}
