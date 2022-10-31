package class5;

import java.util.*;

public class TemporaryTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 일한시간 , 시간당 급여를 입력하세요");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		
		Temporary tem = new Temporary(name, time, pay);
		System.out.println("고용형태 : 임시직");
		System.out.println("이름 : " + tem.getName());
		System.out.println("급여 : " + tem.total());
	}

}
