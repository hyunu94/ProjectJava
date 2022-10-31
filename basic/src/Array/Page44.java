package Array;
import java.util.*;

public class Page44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 문자열을 입력하세요");
		String code = sc.nextLine();
		
		for(int i=0;i<code.length();i++) {
			char ch = (char)code.charAt(i);
			int num =(int)ch;
			System.out.println("str.charAt<" + i + ">:" + ch + "=>" + num);
			
		}
	}

}
