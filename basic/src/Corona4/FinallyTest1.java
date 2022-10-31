package Corona4;

import java.util.Scanner;

/*
 finally
 - 예외발생여부와 상관없이 반드시 실행되어야 하는 구문을 입력하는 곳
 - 예외가 발생해도 호출되며 , 그렇지 않아도 호출됨
 - try영역으로 들어가면 무조건 실행되는 영역
 - 사용했던 자원을 해제할 때 주로 사용(db close , 파일 닫기 등)
 
  try{
  	//예외가 발생할 가능성이 있는 문장을 넣는다
  }catch(Exception e){
  	//예외처리를 위한 문장을 넣는다
  }finally{
  	//예외 발생여부와 상관없이 항상 수행되어야 하는 문장을 넣는다
  }
 */
public class FinallyTest1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력!");
			int n=sc.nextInt();
			int res=100/n;
			System.out.println("res="+res);
		}catch(Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}finally {
			System.out.println("반드시 실행되어야 함!");
		}
		
		System.out.println("\n==============next==========");
	}

}
