package class5;

import java.util.*;

class NameCard1{
	String name,tel,adress,grade;

	public void namecard (String name , String tel , String adress ,String grade) {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + tel);
		System.out.println("회사주소 : " + adress);
		System.out.println("직급 : " + grade);
	}
}

public class NameCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 , 전화번호 , 회사주소 , 직급을 입력하세요");
		String name = sc.nextLine();
		String tel = sc.nextLine();
		String address = sc.nextLine();
		String grade = sc.nextLine();
		
		NameCard1 card = new NameCard1();
		card.namecard(name, tel, address, grade);
	}

}
