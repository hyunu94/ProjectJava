package practice;
import java.util.*;
import java.io.*;

public class Page662 {

	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = "";
		if(num%2==1) {
			result = "홀수";
		}else {
			result = "짝수";
		}
		System.out.println("입력한 정수 " + num);
		
		result = (num%2==1)?"홀수":"짝수";
		System.out.println("\n삼항연산자 이용 결과=>" +result);
		
	}

}

