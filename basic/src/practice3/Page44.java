package practice3;

import java.util.*;

public class Page44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 문자열을 입력하세요");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		int n = (int)ch;
		System.out.println("str.charAt<" + i + ">: " +ch+ "=>" + n );
		}

	}

}
