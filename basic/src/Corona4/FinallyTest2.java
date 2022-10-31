package Corona4;

import java.util.Scanner;
public class FinallyTest2 {
	public static boolean divider(int n1,int n2) {
		try {
			int res = n1/n2;
			System.out.println("나눗셈 결과 : " +res);
			return true;
			//중간에 return을 하더라도 finally 영역은 실행되고 나서 
			//메서드를 빠져나가게 됨
		}catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
			return false;
		}finally {
			System.out.println("finally 영역 실행");
		}
	}
	public static void main(String[] args) {
		boolean bool = divider(40,3);
		if(bool) {
			System.out.println("1-연산성공");
		}else {
			System.out.println("1-연산실패");
		}
		
		if(divider(5,0)) {
			System.out.println("2-연산성공");
		}else {
			System.out.println("2-연산실패");
		}
	}

}
