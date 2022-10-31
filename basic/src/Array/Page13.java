package Array;

import java.util.*;

public class Page13 {

	public static void main(String[] args) {
		int [] arr;
		System.out.println("원하는 배열의 갯수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		for(int i=0;i<num1;i++) {
			System.out.println("arr[" + i + "] = " + i);
		}
		
		
		int [] arr2 = new int [5];
		for(int j = 0;j<arr2.length;j++) {
			arr2[j]+=(j*2)+1;
		}
		
		for(int n : arr2) {
			System.out.println(n);
		}
	}

}
