package Practicer;

import java.util.*;

public class Pride {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어,영어,수학 점수를 입력하세요");
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<3;i++) {
			arr.add(sc.nextInt());
		}
		
		Total to = new Total();
		to.plus(arr);
		to.Aver(to.getTotal());
		
		System.out.println("국어, 영어, 수학 점수 : " + arr.get(0) + "" + arr.get(1) + "" + arr.get(2));
		System.out.println("총점 = " + to.getTotal() +", 평균 = " + to.getAver());

	}

}
