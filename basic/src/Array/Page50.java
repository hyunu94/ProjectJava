package Array;

public class Page50 {

	public static void main(String[] args) {
		int [][] arr = {{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30},{45,45,45,45,45}};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("총합 : " + sum + "\n평균 : " + sum/20 );

	}

}
