package practice3;

public class Page14 {

	public static void main(String[] args) {
	int[] arr = {10,57,19,35,77,26};
	int max = arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n\n최대값 = " + max);
	}

	}

}
