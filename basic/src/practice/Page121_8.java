package practice;

import java.util.*;

public class Page121_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int num = 0;
		int sum = 0;
		if(A>B) {
			num = A;
			A = B;
			B = num;
		}
		for(int i = A; i<=B;i++) {
			sum += i;
			
		}
		System.out.println("두 수 사이의 홀수의 합 : " + sum);
	}

}
