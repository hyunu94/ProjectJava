package Method;

import java.io.IOException;
import java.util.*;

public class Page29 {
	public static int convToint(char ch) {
		int result = (int)ch-48;
		return result;
	}
	
	public static void re(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("A");
			}
			System.out.print("B");
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("0과 9사이의 숫자를 입력하세요 : ");
		char ch=(char) System.in.read();
		int n = convToint(ch);
		System.out.println(n + "=>" + n + "\n" + n + "*" + "100 =" +(n*100));
		
		System.out.println("반복 횟수를 입력하세요");
		int num1 = sc.nextInt();
		re(num1);
	}

}
