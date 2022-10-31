package Array;

public class Page11 {

	public static void main(String[] args) {
		float [] arr;
		arr = new float [3];
		arr[0] = 3.14f;
		arr[1] = 3.15f;
		arr[2] = 3.16f;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	double [] arr2 = new double [4];
	double sum = 0;
	arr2[0] = 31.5;
	arr2[1] = 31.6;
	arr2[2] = 31.7;
	arr2[3] = 31.8;
	for(int i=0;i<arr2.length;i++) {
		sum+=arr2[i];
		}
		System.out.println("총점 : " + sum + ",평균 = " +sum/4);

		
	}

}
