package practice;
import java.util.*;
public class Page81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복하고 싶은 횟수를 입력하세요");
		int n = sc.nextInt();
		int i = 0;
		int sum = 0;
		for(i=1;i<=n;i++) {
			System.out.println("재미있는 java!");
		}
		
		System.out.println();
		for(i=0;i<n;i++) {
			System.out.println("i= " + i);
		}
		System.out.println();
		for(i=0;i<=n;i++) {
			sum+=i;
			System.out.println("i=" +i+ ", sum=" +sum);
		}
		System.out.println("0부터" + n + "까지의 합=" +sum);
	}

}
