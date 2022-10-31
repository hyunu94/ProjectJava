package Corona4;

import java.util.*;

/*
 throw 구문
 - 개발자가 고의로 예외를 직접 발생시킬 수 있다
 - 자바 가상머신에 의해 인식될 수 있는 예외사항이 아니지만 
 개발자가 정의한 예외상황인 경우 사용
 -throw문을 써서 예외를 직접 발생시키면 catch문의 코드가 실행됨
 
 throw nex Exception("예외 메세지");
 */

public class ThroowTest1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("나이 입력!");
			int age = sc.nextInt();
			
			if(age<0 || age>150) {
				throw new Exception("나이는 양수여야 하고 150보다 작아야 함!");
			}
			
			System.out.println("나이 : " + age);
		}catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		System.out.println("\n=======next==========");

	}

}
