package practice;
import java.util.*;
public class Page73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~n 까지의 덧셈 : n 을 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		for(int i  = 0 ; i<=n;i++) {
			System.out.println(sum + "+" + i);
			sum+=i;
		}
		System.out.println("\n1~"+n+"까지의 합 : " + sum);
	}

}
