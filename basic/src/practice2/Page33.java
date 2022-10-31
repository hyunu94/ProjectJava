package practice2;

import java.util.*;
public class Page33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)Math.random()*99+1;
		String result ="";
		int i = 0;
		while(i<4) {
			if(i==4) {
				result = "종료되었습니다.";
				break;}
			System.out.println("1부터 100사이의 숫자를 입력하세요");
			int temp = sc.nextInt();
			if(answer == temp) {
				System.out.println("정답입니다!");
				break;
			}
			if(answer>temp){
				result = "조금 더 높은 수예요"; 
			}else{
				result = "조금 더 낮은 수예요";	
			}
			i++;
			}	
		}
		

	}


