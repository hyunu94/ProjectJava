package practice3;

import java.util.*;

public class Page45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요");
		int [] arr = new int [5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		for{int i=0;
			for(int k=0;k<i;k++) {
				if(arr[i]>arr[k]) {
					int temp = arr[i];
					arr [i] = arr[k];
					arr[k] = arr[i];
				}
				if(arr[i]==arr[k]) break;
				
				
			}
			System.out.print(arr[i] + "\t");
		}
		
		

	}

}
