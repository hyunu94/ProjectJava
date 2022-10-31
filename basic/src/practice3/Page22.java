package practice3;

import java.util.*;

public class Page22 {

	public static void main(String[] args) {
		int[] arr = {10,5,44,55,1000,140,3,55};
		
		System.out.println("Before sorting:");
		
		for(int i : arr) {
			System.out.print(i);
		}
		
		Arrays.sort(arr);
		for(int i : arr) {
		System.out.print(i);
		
		}
		
	}
}
