package class5;

import java.util.*;

public class Page55_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어,영어,수학 점수를 입력하세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Score sco = new Score(kor,eng,math);
		int sum = sco.total();
		int aveg = sco.aveg();
		System.out.println("총점 = "+sum+ ",평균 = " + aveg);
	}

}
