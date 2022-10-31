package Array;

public class Page46_2 {

	public static void main(String[] args) {
		double [][] arr2 = new double [3][2];
		arr2 [0][0] = 10.1;
		arr2 [0][1] = 10.2;
		arr2 [1][0] = 10.3;
		arr2 [1][1] = 10.4;
		arr2 [2][0] = 10.5;
		arr2 [2][1] = 10.6;
		
		int a = arr2.length;
		int b = arr2[0].length;
		
		double [] arr = new double [a*b];
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				arr[i*j] = arr2[i][j];
				System.out.println(arr[i*j]);
			}
		}
		}
		
}


