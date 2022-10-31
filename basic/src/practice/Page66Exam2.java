package practice;
import java.io.*;
public class Page66Exam2 {
	public static void main(String [] args)throws IOException{
		System.out.println("0~9나 알파벳 , 그외 문자를 입력하세요");
		char ch = (char)System.in.read();
		String result = "";
		if(ch>='0' && ch<='9') {
			result = "숫자입니다";
		}else if(ch>='A' && ch<='Z') {
			result = "알파벳 문자입니다";
		}else if(ch>='a' && ch<='z') {
			result = "알파벳 문자입니다";
		}else {
			result = "기타 문자입니다";
		}
		System.out.println("입력한 값 : " + ch + "\n" + result);
	}
}
