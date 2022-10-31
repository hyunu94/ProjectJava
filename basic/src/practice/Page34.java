package practice;

import java.util.*;

public class Page34 {

	public static void main(String[] args) {
		int num = -25;
		String result = (num>0)?"양수":"음수";
		System.out.println("num=" +num+ " =>" +result);
		
		int num2 = 17;
		String result2 = (num2%2==1)?"홀수":"짝수";
		System.out.println("num2=" +num2+ " =>" +result2);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num3 = sc.nextInt();
		String result3 = (num3%2==1)?"홀수":"짝수";
		System.out.println("num3="+num3+" => " +result3);
	}

}
