package Corona2;

/*
 상속과 구현을 동시에 할 수 있다
 예)
 class Fighter extends Unit implements Fightable{
 }
 
 인터페이스는 다중 상속 가능
 인터페이스끼리의 상속에는 extends 키워드 이용
 예)
 interface Fightable extends Movable, Attackable{
 }
 
 하나의 클래스가 여러 개의 인터페이스를 상속받아 구현할 수 있다
 예)
 class IPTv implements TV, Computer{}
 */


interface TV2{
	public static void onTV() {
		System.out.println("TV 영상 출력 중");
	}
}

interface Computer2{
	public void dataReceive();
}

//인터페이스 다중 상소
class IPTV2 implements TV2 , Computer2{
	public void dataReceive() {
		System.out.println("영상 데이터 수신중");
	}
	
	public void onTV() {
		System.out.println("TV영상 출력중");
	}
	
	public void powerOn() {
		dataReceive();
		onTV();
	}
}
public class IPVcTest2 {
	public static void main(String[] args) {
		IPTV2 obj = new IPTV2();
		obj.powerOn();

	}

}
