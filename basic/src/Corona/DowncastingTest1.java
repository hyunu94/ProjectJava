package Corona;

class Car {
String color;
int door;
void drive() { // 운전하는 기능
System.out.println("drive, Brrrr~");
}
void stop() { // 멈추는 기능
System.out.println("stop!!!");
}
}//
class FireEngine extends Car { // 소방차
void water() { // 물을 뿌리는 기능
System.out.println("water!!!");
}
void drive() { // 운전하는 기능
System.out.println("소방자를 운전합니다~");
}
}//

class Ambulance extends Car { // 앰뷸런스
void siren() { // 사이렌을 울리는 기능
System.out.println("siren~~");
}
void drive() {
System.out.println("앰뷸런스를 운전합니다~");
}
}

public class DowncastingTest1 {
	

	public static void main(String[] args) {
		Car c = new FireEngine(); //자동 형변환
		c.drive();
		//c.water(); //error
		FireEngine f = (FireEngine)c; //명시적 형변환
		f.water(); //자식만의 메서드도 호출 가능해짐
		//FireEngine f2 = (FireEngine)new Car(); //실행에러 (Class Cast Exception
		
		//형변환을 수행하기 전에 instanceof 연산자를 사용해서
		//참조변수가 참조하고 있는 실제 인스턴스의 타입을 확인하는 것이 안전함
		/*
		 instanceof 연산자
		 참조변수 instanceof 타입(클래스명)
		 => 참조변수가 해당 클래스의 인스턴스인가? 맞으면 true , 아니면 false
		 
		 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해
		 instanceof 연산자를 사용함.
		 
		 */
		
		if(c instanceof FireEngine) {
			FireEngine fe = (FireEngine)c;
			fe.water();
		}else {
			System.out.println("c를 FireEngine으로 형변환 불가");
		}
		
		Car c2 = new Ambulance();
		if(c2 instanceof Ambulance) {
			Ambulance am = (Ambulance)c;
			am.siren();
		}else {
			System.out.println("c를 Ambulance로 형변환 불가");
		}
		
		Car c3 = new Car();
		if(c3 instanceof FireEngine) {
			FireEngine fe = (FireEngine)c;
			fe.water();
		}else {
			System.out.println("c2를 FireEngine으로 형변환 불가");
		}
		
		/*
		• 자식객체 instanceof 부모클래스 : true
		• 부모타입의 instanceof 연산에도 true
		=> 자식은 부모의 인스턴스이기도 하므로
		*/
		FireEngine f2 = new FireEngine();
		if(f2 instanceof FireEngine) {
			System.out.println("f2는 FireEngine의 인스턴스");
		}
		if(f2 instanceof Car) {
			System.out.println("f2는 Car의 인스턴스");
		}
		if(f2 instanceof Object) {
			System.out.println("f2는 Object의 인스턴스");
		}
	}

}
