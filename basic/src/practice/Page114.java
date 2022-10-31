package practice;

import java.util.*;

public class Page114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 월을 입력하세요");
		int month = sc.nextInt();
		String result = "";
		if (month >= 1 && month <= 3) {
			result = "1사분기";
		} else if (month >= 4 && month <= 6) {
			result = "2사분기";
		} else if (month >= 7 && month <= 9) {
			result = "3사분기";
		} else if (month >= 10 && month <= 12) {
			result = "4사분기";
		} else {
			result = "잘못 선택했어요";
		}
		System.out.println(result);

		int gender = 0;
		if (gender == 1) {
			result = "남자";
		} else {
			result = "여자";
		}
		System.out.println(result);
		
		if(gender==1 || gender==3) {
			result = "남자";
		}else if(gender==2 || gender==4) {
			result = "여자";
		}else {
		}
		
		System.out.println(result);


	}

}
