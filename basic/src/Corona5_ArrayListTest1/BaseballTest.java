package Corona5_ArrayListTest1;

import java.util.*;

public class BaseballTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[3];
		int index = 0;
		Pincher pin = new Pincher();
		Umpire ump = new Umpire();
		Hitter hitt = new Hitter();
		
		while(true) {
		System.out.println("다른 세 수를 입력하세요 <0~9>");
		
		int hit1 = sc.nextInt();
		int hit2 = sc.nextInt();
		int hit3 = sc.nextInt();
		
		num[0] = hit1;
		num[1] = hit2;
		num[2] = hit3;
		
		hitt.setHit(num); 
		int [] hitt = hitt.getHit();
		int [] pinch =pin.save();
		
		Umpire(pin,hitt);
		
		index++;
		
		
		if(index<9 || )	break;
		
		
		
		
		index++;
		}//while

	}
}
