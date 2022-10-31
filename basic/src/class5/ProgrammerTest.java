package class5;

import java.util.*;

public class ProgrammerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 개발언어, 개발경력을 입력하세요");
		String name = sc.nextLine();
		String language = sc.nextLine();
		int career = sc.nextInt();
		
		Programmer pro = new Programmer();
		pro.setName(name);
		pro.setLanguage(language);
		pro.setCareer(career);
		
		System.out.println("이름 :" + pro.getName() + "\n개발언어 : " +pro.getLanguage()+ "\n개발경력 : " +pro.getCareer() + "년");
		pro.work();
	}

}
