package practice3;

import java.util.*;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 문자열을 입력하세요");
		String str = sc.nextLine();
		char [] ch;
		int [] num;
		
		for(int i=0;i<str.length();i++) {
			ch[i]=(char)str.charAt(i);
			int	num[i] = (int)ch[i];
			System.out.println("str.charAt<" + i + "> : " + ch[i] + "=>" + num[i]);
		}
	}
}	
