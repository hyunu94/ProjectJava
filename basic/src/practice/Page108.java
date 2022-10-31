package practice;
import java.util.*;
public class Page108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 뒷자리의 성별에 해당하는 숫자를 입력하세요<1,2,3,4>");
		int back = sc.nextInt();
		String result = "";
		switch(back) {
			case 1 :
				result = "남자";
				break;
			case 2 : 
				result = "여자";
				break;
			case 3 : 
				result = "2000년 이후 출생한 남자";
				break;
			default :
				result = "2000년 이후 출생한 여자";
		}
		System.out.println(result);
	}

}
