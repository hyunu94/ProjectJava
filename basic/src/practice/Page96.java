package practice;
import java.util.*;
public class Page96 {

	public static void main(String[] args) {
		int k = 0;
		int sum = 0;
		while(k<=100){
				sum+=k;
				k+=2;
		}
		System.out.println("0~100까지 짝수의 합 : " + sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단의 단을 입력하세요");
		int n = sc.nextInt();
		int i = 9;
		while(i>=1) {
			System.out.println(n + " * " + i + " = " + n*i);
			i--;
		}
		
	}

}
