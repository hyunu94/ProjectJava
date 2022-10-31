package practice;
import java.util.*;
public class Page62 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("직업을 입력하세요 : A.회사원 B.학생 C.주부 D.기타");
		String job = sc.nextLine();
		String result = "";
		if(job.equals("A")){
			result = "회사원이시군요";
		}else if(job.equals("B")) {
			result = "학생이시군요";
		}else if(job.equals("C")) {
			result = "주부이시군요";
		}else if(job.equals("D")) {
			result = "기타를 선택했어요";
		}else {
			result = "잘못 입력했어요";
		}
		System.out.println(result);
	}
}
