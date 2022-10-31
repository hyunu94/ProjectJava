package practice;
import java.util.*;
public class Page63 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연산자를 입력하세요(+,-,*,/,%)");
		String san = sc.nextLine();
		System.out.println("실수를 두 개 입력하세요");
		Double num = sc.nextDouble();
		Double num2 = sc.nextDouble();
		Double result = 0.0;
		switch(san) {
			case "+" :
				result = num + num2;
				break;
			case "-" :
				result = num - num2;
				break;
			case "*" :
				result = num*num2;
				break;
			case "/" :
				result = num/num2;
				break;
			case "%" :
				result = num%num2;
				break;
		}
		System.out.println("결과값 : " + result);
		
		if(san.equals("+")) {
			result = num + num2;
		}else if(san.equals("-")) {
			result = num - num2;
		}else if(san.equals("*")) {
			result = num * num2;
		}else if(san.equals("/")) {
			result = num/num2;
		}else if(san.equals("%")) {
			result = num%num2;
		}else {
		}
		System.out.println("결과값 : " + result);
	}
}