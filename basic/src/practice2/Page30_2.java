package practice2;

import java.util.*;
import java.io.*;

public class Page30_2 {
	public static boolean disting(String a) {
		char ch = ' ';
		boolean bool = true;//1234a
		for(int i =0 ; i<a.length();i++) {
			ch = a.charAt(i);
			if(!(ch>='0' && ch<='9')) {
				bool = false;
				break;
			}
		}
		return bool;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		String price = sc.nextLine();
		String result = "";
		boolean bool = disting(price);
		if(bool) {
			result = "는 숫자입니다";
		}else {
			result = "는 숫자가 아닙니다";
		}
		System.out.println(price + result);

	}

}
