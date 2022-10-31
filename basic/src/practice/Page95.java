package practice;
import java.util.*;
public class Page95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3의 배수의 개수를 입력하세요");
		int num = sc.nextInt();
		for(int i = 3;i<=num*3;i+=3) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		System.out.println("n의 계승 구하기 : n을 입력하세요");
		int n = sc.nextInt();
		int sum = 1;
		for(int j = 1; j<=n ; j++){
			sum*=j;
		}
		System.out.println("1~"+n+"까지의 곱<계승, factorial>:" +sum );
	}

}
