package practice3;

import java.util.*;

public class Page28 {
	public static void aver(int [] score) {
		int sum = 0;
		for(int i = 0;i<score.length;i++) {
			sum+=score[i];
		}
		
		int aver = sum/score.length;
		System.out.println("총점 :" + sum +", 평균 : " +aver);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어,영어,수학 점수를 입력하세요");
		int [] aver = new int [3];
		for(int i = 0;i<aver.length;i++) {
			aver [i] = sc.nextInt();
		}
		aver(aver);

	}

}
