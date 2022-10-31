package Array;

public class Page46 {

	public static void main(String[] args) {
		String [] arr = new String [4];
		arr[0] = "봄";
		arr[1] = "여름";
		arr[2] = "가을";
		arr[3] = "겨울";
		for(int i = 0;i<arr.length;i++) {
			System.out.println("season[" + i + "] = " +arr[i]);
		}
		
		double [][] arr2 = new double [3][2];
		arr2 [0][0] = 10.1;
		arr2 [0][1] = 10.2;
		arr2 [1][0] = 10.3;
		arr2 [1][1] = 10.4;
		arr2 [2][0] = 10.5;
		arr2 [2][1] = 10.6;
		for(int j=0;j<arr2.length;j++) {
			for(int k=0;k<arr2[0].length;k++) {
				System.out.println(arr2[j][k]);
			}
		}
		
		
	}

}
