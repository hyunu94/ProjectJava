package practice3;

import java.util.*;

public class Page13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 배열의 갯수를 입력하세요");
		int i = sc.nextInt();
		int [] arr = new int [i];
		
		for(i = 0; i<arr.length;i++) {
		arr[i] = i;
		System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		int [] arr2 = new int [5];
		for(int j=0;j<arr2.length;j++) {
			arr2[j] = (j*2)+1;
		}
		for(int n : arr2){
		System.out.print("arr2의 배열의 값 : " + n +"\n");
		}
	}
}
