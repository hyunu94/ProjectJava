package practice;
import java.util.*;
public class Page65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int total2 = kor + eng + math;
		Double total = (kor+eng+math)+0.0;
		Double ave = (kor+eng+math)/3.0;
		String result = "";
		if(ave>=70) {
			if(kor>=50 && eng>=50 && math>=50) {
				result = "합격";
			}else if(kor<50 || eng<50 || math<50) {
				result = "과락";
			}	
		}else {
			result = "불합격";
		}
		String n = "";
		switch((int)ave/10) {
			case 10:
			case 9:
				n = "A";
				break;
			case 8 :
				n = "B";
				break;
			case 7 : 
				n = "C";
				break;
			case 6 :
			case 5 :
				n = "D";
			default :
				n = "F";
		}
		System.out.println("\n평균 : "+ave+", 학점 :  " + n + "\n합격여부 : " + result );
		
		
		
	}
}