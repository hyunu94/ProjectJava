package practice3;

import java.util.*;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요");
		int [] num = new int [5];
		int temp = 0;
		
		for(;;){
			for(int i=0;i<num.length;i++) {
				num[i] = sc.nextInt();
				if(num[i]<num[0]) { 
					temp=num[0]; 
					num[0]=num[1];  
					num[1]=temp;
				}
			
				for(int k=0;k<i;k++) {
					if(num[i]==num[k]) {
						i--;
						break;
					}
				}
			}
			for(int n : num) 
				System.out.print(n + "\t");
		}//for;;
	}		
}