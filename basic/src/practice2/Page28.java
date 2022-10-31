package practice2;

public class Page28 {
	
	public static void year(int a) {
		String result = "";
		if(a%400==0 || (a%4==0 &&a%100!=0)) {
			result = "윤년";
		}else {
			result = "평년";
		}
		System.out.println(result);
	}
	
	public static void gender2(int a) {
		String result = "";
		if(a==2 || a==4) {
			result = "여자";
		}else {
			result = "남자";
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int a = 2022;
		year(a);
		
		int b = 3;
		gender2(b);
		

	}

}
