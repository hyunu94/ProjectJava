package practice;
import java.util.*;
public class Page64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		String result = "";
		if(age>=20) {
			System.out.println("취미를 입력하세요 : 1. 영화 2. 축구 3. 야구 4. 등산");
			int n = sc.nextInt();
			if(n==1) {
				result = "영화를 선택하셨습니다";
			}else if(n==2){
				result = "축구를 선택하셨습니다";
			}else if(n==3){
				result = "야구를 선택하셨습니다";
			}else if(n==4) {
				result = "등산을 선택하셨습니다";
			}
			System.out.println(result);
		}else {
			System.out.println("20세 이상만 본 설문에 응할 수 있습니다.");
		}
	
	}

}
