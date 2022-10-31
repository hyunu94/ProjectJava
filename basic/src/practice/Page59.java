package practice;
import java.util.*;
public class Page59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜<일>을 입력하세요<1~31>");
		int day = sc.nextInt();
		String result = "";
		if(day>=1&&day<=10) {
			result = "초순";				
		}else if(day>=11&&day<=20) {
			result = "중순";
		}else if(day>=21&&day<=31) {
			result = "하순";
		}else {
			result = "잘못 입력하였습니다.";
		}
		System.out.println(day+ " 일 : " + result);
		
		System.out.println("성별을 입력하세요 <1.남자 , 2.여자>");
		int day2  = sc.nextInt();
		if(day2==1) {
			result = "남자입니다";
		}else if(day2==2) {
			result = "여자입니다";
		}else {
			result = "잘못 입력하였습니다";
		}
		System.out.println("성별은 " + result);
		
		System.out.println("성별을 입력하세요 <1,3.남자 , 2,4.여자>");
		int day3 = sc.nextInt();
		if(day3==1||day3==3) {
			result = "남자입니다";
		}else if(day3==2||day3==4){
			result = "여자입니다";
		}else {
			result = "잘못 입력하였습니다";
		}
		System.out.println("성별은 " + result);
		
	}

}
