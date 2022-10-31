package practice;
import java.util.*;

public class page58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("취미를 입력하세요 : 1. 영화 2. 축구 3. 야구 4. 등산");
		int num = sc.nextInt();
		String result = "";
		if(num==1) {
			result = "영화를 선택하였습니다";
		}else if(num==2) {
			result = "축구를 선택하였습니다";
		}else if(num==3) {
			result = "야구를 선택하였습니다";
		}else if(num==4) {
			result = "등산을 선택하였습니다";
		}else {
		}
		System.out.println(result);
		
		String result2 = "";
		switch(num){
		case 1 :
			result2 = "영화를 선택하였습니다";
			break;
		case 2 :
			result2 = "축구를 선택하였습니다";
			break;
		case 3 : 
			result2 = "야구를 선택하였습니다";
			break;
		case 4 :
			result2 = "등산을 선택하였습니다";
			break;
		default :
			break;
		}
		System.out.println(result2);
	}
	
}

