package practice2;

import java.util.*;
import java.io.*;

public class Page29 {
	
	public static int convToint(char ch) {
		int a = ch-48;
		return a;
	}
	
	public static void triangle(int a) {
		for(int i = 1 ; i<=5 ; i++) {
			for (int k = 1 ; k<=5 ; k++) {
				if(i==k) break;
				System.out.print("A");
			}
			System.out.println("B");
		}
	}

	public static void main(String[] args)throws IOException {
		System.out.print("0~9사이의 숫자를 입력하세요");
		char ch = (char)System.in.read();
		int change = convToint(ch);
		System.out.print(change + "=>" + change + "\n" + change + "*100 = " +change*100 );
		System.in.read();
		int num1 = 5;
		triangle(num1);
	}

}
