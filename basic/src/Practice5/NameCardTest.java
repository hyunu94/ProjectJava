package Practice5;

import java.util.Scanner;

class NameCard{
	private String name , tel , adress , pride;
	
	NameCard(String name,String tel,String adress , String pride){
		this.name = name;
		this.tel = tel;
		this.adress = adress;
		this.pride = pride;
	}
		public void shout() {
			System.out.println("이름 : " + name);	
			System.out.println("전화번호 : " + tel);
			System.out.println("회사주소 : " + adress);
			System.out.println("직급 : " + pride);
		
	}
}

public class NameCardTest {
	public static void main(String[] args) {
		System.out.println("이름, 전화번호 , 회사주소 , 직급 입력!");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String tel = sc.nextLine();
		String adress = sc.nextLine();
		String pride = sc.nextLine();
		
		NameCard nal = new NameCard(name, tel, adress, pride);
		nal.shout();
	}

}
