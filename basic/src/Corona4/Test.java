package Corona4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.print("두 개의 정수 입력: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		try{
			System.out.println("나눗셈 결과의 몫: "+(num1/num2));
			System.out.println("나눗셈 결과의 나머지: "+(num1%num2));
			}catch(Exception e){
		System.out.println("예외발생 : " + e.getMessage());
		}
		
		System.out.println("프로그램을 종료합니다.");
		}
}
		//1. 예외발생
		//2. 참조값 전달하면서 catch 영역 실행


