package Practice5;

import java.util.*;

class Time{
	private int hour,minute,second;
	
	Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	Time(int hour,int minute){
		this.hour = hour;
		this.minute = minute;
	}
	
	Time(int hour){
		this.hour = hour;
	}
	
	public void change(){
		System.out.println(hour + "시" + minute + "분" + second + "초");
	}
	
	public int cho() {
		return (hour*60*60 + minute*60 + second);
	}
}

public class TimeTest {
	public static void main(String[] args) {
		System.out.println("시 , 분 , 초 입력");
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		
		Time tim = new Time(hour,minute,second);
		tim.change();
		System.out.println("초로 환산하면 " + tim.cho());
		
		Time tim2 = new Time(hour,minute);
		tim2.change();
		System.out.println("초로 환산하면 " + tim2.cho());
		
		Time tim3 = new Time(hour);
		tim3.change();
		System.out.println("초로 환산하면 " + tim3.cho());
	}

}
