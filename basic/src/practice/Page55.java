package practice;
import java.util.*;
public class Page55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연산자를 입력하세요<+, -, *, />");
		String input = sc.nextLine();
		switch(input) {
			case "+" :
				System.out.println("더하기");
				break;
			case "-" :
				System.out.println("빼기");
				break;
			case "*" :
				System.out.println("곱하기");
				break;
			case "/" :
				System.out.println("나누기");
				break;
			default :
				System.out.println("잘못 입력!");
			}
		String result = "";
		if(input.equals("+")) {
			System.out.println("더하기");
		}else if(input.equals("-")){
			System.out.println("빼기");
		}else if(input.equals("*")){
			System.out.println("곱하기");
		}else if(input.equals("/")){
			System.out.println("나누기");
		}else{
			System.out.println("잘못 입력!");
		}
			
			
		}
}