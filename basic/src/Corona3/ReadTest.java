package Corona3;

import java.io.IOException;

public class ReadTest {
	public static void main(String[] args) {
		try {
		System.out.println("성별 입력");
		char gender = (char)System.in.read();
		
		String result = "";
		switch(gender) {
			case 'M':
			result = "남자";
			break;
			
			case 'F':
			result = "여자";
			break;
			default:
			result = "잘못 입력!";
			break;
		}
		
		System.out.println(result);
		}catch(IOException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		System.out.println("\n====next=======");
		
	}

}
