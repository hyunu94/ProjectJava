package Corona4;

/*
 예외를 처리하는 방법
 [1]try~catch문을 사용 - 직접 예외 처리
 [2]throws를 이용한 예외 떠 넘기기(예외전달, 예외를 메서드에 선언하는 방법)
 	메서드 선언부에 throws를 사용해서 메서드 내에서 발생할 수 있는 예외를 
 	적어주기만 하면 됨
 	
 	void method() throws Exception1, Exception2{
 	}
 	
 	=> 사용하는 쪽에서 이에 대한 처리를 하도록 강요함
 	
 	RuntimeException 클래스와 그 자식 클래스들은 예외처리해주지 않아도 됨
 	그 이외 나머지 예외 클래스들은 반드시 예외처리 해주어야 함
 	(안하면 컴파일 에러 발생)
 */
public class ThrowsTest2 {
	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception{
		throw new Exception("에러 발생함!!");
	}
	
	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}

	}

}
