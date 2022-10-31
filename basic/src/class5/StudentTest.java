package class5;

import java.util.*;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 학번을 입력하세요");
		String name = sc.nextLine();
		int idNo = sc.nextInt();
		
		Student stn = new Student();
		stn.setName(name);
		stn.setIdNo(idNo);
		
		System.out.println("이름 : " + stn.getName() + "\n나이 : " + stn.getIdNo());
	}

}
