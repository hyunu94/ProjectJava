package Array;
import java.util.*;

public class Page45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		System.out.println("5개의 숫자를 입력하세요");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
		}
		
		for(int k = 0;k<arr.length;k++) {
			System.out.print(arr[k] + "\t");
		}
		
	}
}
