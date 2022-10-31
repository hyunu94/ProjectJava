package Array;

public class Page49 {

	public static void main(String[] args) {
		int [][] arr = new int [3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j || i+j==2) {
					arr[i][j] = 1;
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
