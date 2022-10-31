package practice3;

import java.util.*;

public class practice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [8];
		int sum = 0 , sum2=0;
		while(true) {
			for(int i = 0;i<arr.length;i++) {
		System.out.println("복권 판매점 번호<1~8>와 복권 판매량을 입력하세요.<끝낼때는 q>");
		arr[i] = sc.nextInt();
		sum= sc.nextInt();
		System.out.println("그룹번호 : " + arr[i] + ", 판매량 = " +sum);
			String end = "";
			sum2+=sum;
		if(end.equalsIgnoreCase("Q")) { 
			break;
					}
			
				}
			for(int j = 0;j<arr.length;j++) {
				System.out.println("복권 판매점번호 : " + arr[j] + "sum" + sum2);
			
			}
		}	
	}
}