package remember;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		char ch = 'a';
		
		for(int i='a';i<'z';i++) {
			char ch2 = (char) (count + ch);
			System.out.print( ch2 + " ");
			count++;
		}
		
	}	
}
