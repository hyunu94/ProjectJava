package Practice5;

import java.util.*;

class Score{
	private int kor,eng,math;
	
	Score(int kor,int eng,int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int sum() {
		return kor+eng+math;
	}
	
	public double aver() {
		double d = sum()/3;
		return Math.round(d)*100/100;
	}
}

public class ScoreTest {
	public static void main(String[] args) {
		System.out.println("국어,영어,수학 점수 입력!");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Score sco = new Score(kor,eng,math);
		System.out.println("총점 : " + sco.sum() + ",평균 : " + sco.aver());
	}

}
