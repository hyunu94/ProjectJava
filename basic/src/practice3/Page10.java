package practice3;

public class Page10 {

	public static void main(String[] args) {
		System.out.println("=========변경 전================");
		int [] arr = {90,75,70,90,60,85,75,70};
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int k = 0;k<arr.length;k++) {
			arr[k]+=5;
			System.out.println(arr[k]);
		}
		
	}

}
