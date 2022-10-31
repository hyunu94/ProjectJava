package practice3;

public class page11 {

	public static void main(String[] args) {
		float [] arr;
		arr = new float [3];
		arr[0] = 12.5f;
		arr[1] = -24.3f;
		arr[2] = 0.76f;
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		double sum = 0 , aver = 0;
		double [] arr2 = {31.1,31.2,31.3,31.4};
		for(int j =0;j<arr2.length;j++) {
			sum+=arr2[j];
			aver=sum/4;
		}
		System.out.println("총점 : " + sum + ", 평균 : " +aver );
		
		String [] arr3 = new String [2];
		arr3[0] = "hong";
		arr3[1] = "hyun";
		for(int k = 0 ; k<arr3.length;k++) {
			System.out.println(arr3[k]);
		}
	}

}
