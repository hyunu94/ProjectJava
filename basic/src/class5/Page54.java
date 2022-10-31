package class5;

import java.util.*;

public class Page54 {
	
	public static int total(int a , int b , int c) {
		int result = a+b+c/3;
		return result;
	}
	
	public static double aver(int n){
		double result = n/3;
		return result;
	}

	public static void main(String[] args) {
		int kor , math , eng;
		int sum=0;
		int [] arr = new int [3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어,영어,수학 점수를 입력하세요");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("총점 : " + sum + ", 평균= " +sum/arr.length);
		
		int result = total(arr[0],arr[1],arr[2]);
		double aver = aver(result);
		
		System.out.println("총점 : " + result + ", 평균= " +aver);
	}

}
