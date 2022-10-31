package practice;

import java.util.*;
public class Page45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 성별은 무엇입니까? <M>ale/<F>emale");
		String gender = sc.nextLine();
		if(gender.equals("M")){
			System.out.println("남자이시군요");			
		}else if(gender.equals("F")){
			System.out.println("여자이시군요");
		}else{
			System.out.println("잘못 입력했습니다");
		}
		
		System.out.println("평균을 입력하세요");
		int ave = sc.nextInt();
		System.out.println("평균 : " + ave);
		if(ave>=90) {
			System.out.println("학점 : A");
		}else if(ave>=80) {
			System.out.println("학점 : B");
		}else if(ave>=70) {
			System.out.println("학점 : C");
		}else if(ave>=50) {
			System.out.println("학점 : D");
		}else {
			System.out.println("학점 : F");
		}

	}

}
