package Corona4;

import java.util.Scanner;

public class Testexam {

	public static void main(String[] args) {
		System.out.println("주민번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		try {
			String num = sc.nextLine();
			if(num.length() < 13) {
				throw new Exception("주민번호는 13자리여야 합니다");
			}
			
			System.out.println("주민번호 : " + num);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("주민번호 처리 완료!");
		}

	}

}
