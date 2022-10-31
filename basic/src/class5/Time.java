package class5;

import java.util.*;

class Time1{
	int hour,min,sec;
	
	 public Time1(int p_hour , int p_min , int p_sec) {
		 hour = p_hour;
		 min = p_min;
		 sec = p_sec;
	 }
	 
	 public Time1(int p_hour , int p_min ) {
		 hour = p_hour;
		 min = p_min;
	 }
	 
	 public Time1(int p_hour ) {
		 hour = p_hour;
	 }
	 
	public void data() {
		System.out.println(hour + "시 " + min + "분 " + sec +"초");
	}
	
	public int change() {
		int result = (hour*60*60 + min*60 + sec);
		return result;
	}
}

public class Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시,분,초를 입력하세요");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		System.out.println("============================================");
		Time1 tm = new Time1(hour,min,sec);
		tm.data();
		int result = tm.change();
		System.out.println("초로 환산하면 " +result);
		
		Time1 tm1 = new Time1(hour,min);
		tm1.data();
		int result2 = tm1.change();
		System.out.println("초로 환산하면 " +result2);
		
		Time1 tm2 = new Time1(hour);
		tm2.data();
		int result3 = tm2.change();
		System.out.println("초로 환산하면 " +result3);
	}

}
