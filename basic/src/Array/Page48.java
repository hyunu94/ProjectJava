package Array;

import java.util.*;

public class Page48 {

	public static void main(String[] args) {
		double [] arr = new double [5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("잔고를 입력하세요");
			arr[i] = sc.nextDouble();
		}
		
		System.out.println("이자율을 입력하세요");
		double math = sc.nextDouble();
		
		for(int j=0;j<arr.length;j++) {
			arr[j]+=(0.01*math)*arr[j];
			System.out.println(Math.round(arr[j]));
		}
	}

}
