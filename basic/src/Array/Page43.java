package Array;

import java.util.*;

public class Page43 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[8] ;
		String result = "";
		
		for(;;) {
			System.out.println("복권판매점 번호<1~8>와 복권 판매량을 입력하세요.<끝낼때는 q>");
			String num = sc.nextLine();
			
			if(num.equalsIgnoreCase("q"))
				break;
			
			int num2 = Integer.parseInt(num);
			int num3 = sc.nextInt();
			for(int j=0;j<arr.length;j++){
				sum+=num3;
			}
		
			System.out.println("그룹번호 : " + num + ", 판매량 : " + sum  );
			String result = "";
			
		}
	}

}
