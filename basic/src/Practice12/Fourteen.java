package Practice12;

import java.util.Scanner;

class numException extends Exception{
	public numException(){
		super("주민번호는 14자리 입니다.");
	}
}

public class Fourteen {
	public static String readnum() throws numException{
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String name = sc.nextLine();
		if(name.length()!=13) {
			numException num = new numException();
			throw num;
		}
		return name;
	}
	
	public static void main(String [] args) {
		try {
		String name = readnum();
		System.out.println("주민번호는 " + name + "입니다");
		}catch{
	}
}
