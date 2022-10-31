package practice;
import java.util.*;
public class Page61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		String result = "";
		if(num>0) {
			result = "양수입니다";
		}else if(num<0){
			result = "음수입니다";
		}else {
			result = "0입니다";
		}
		System.out.println(result);
		
		sc.nextLine();
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		int password = sc.nextInt();
		if(id.equals("hong")&&password==1234) {
			result = "로그인되었습니다";
		}else {
			result = "아이디나 비밀번호가 틀렸습니다";
		}
		System.out.println(result);
	}

}
