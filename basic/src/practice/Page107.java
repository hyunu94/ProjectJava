package practice;
import java.util.*;
public class Page107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = sc.nextInt();
		String result = ""; 
		String result2 = "";
		if(year%4==0) {
			if(year%100!=0) {
				result2 = "윤년";
			}else{
				result2 = "평년";
			}
			result = "짝수 해, ";
		}else {
			result = "홀수 해, 평년";
		}
			
		System.out.println(year + "년 : " + result + result2);
	}

}
