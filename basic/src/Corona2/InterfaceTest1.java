package Corona2;

import java.util.Scanner;

/*
 인터페이스
 - 일종의 추상클래스
 - 추상메서드와 상수만을 멤버로 가질 수 있다
 - 메서드 목록만을 가진다, 클래스의 뼈대만을 가지고 있는 것
 - 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는데 사용됨
 - 계약, 일종의 약속으로 최소한의 계약 사항을 명시할 뿐
 - 의무적으로 구현해야 하는 메서드의 목록을 작성하여 자식 클래스들이 강제로
 구현하도록 함
 
 interface 인터페이스이름{
 	public static final 타입 상수이름 = 값;
 	public abstract 반환타입 메서드이름();
 }
 
 인터페이스 멤버들의 제약사항
 -모든 상수는 public static final 이어야 하며 , 이를 생략할 수 있다
 -모든 메서드는 public abstract 이어야 하며 , 이를 생략할 수 있다
 
 인터페이스도 객체 생성 불가
 자식이 구현해야 함
 
 interface 인터페이스이름{
 
 }
 
 class 클래스이름 implements 인터페이스이름{
 }
 
 자식 클래스가 인터페이스의 메서드 중 일부만 구현한다면, 자식도 추상 클래스가
 되어야 함
 
 */
interface IAnimal{
	public abstract void sound();
	void showInfo();
}

class Cat2 implements IAnimal{
	public void sound() {
		System.out.println("야옹");
	}
	
	public void showInfo() {
		System.out.println("Cat 메서드");
	}
}

abstract class Dog2 implements IAnimal{
	//부모 인터페이스인 IAniaml의 추상 메서드 중 showInfo()는 구현되지 않았으므로
	//Dog2 또한 추상 클래스로 된다
	public void sound() {
		System.out.println("멍멍!");

	}	
}

class Cow2 implements IAnimal{
	

	public void sound(){
		System.out.println("음메~");
	}
	
	public void display(){
		System.out.println("Cow 클래스!!!!");
	}
	
	public void showInfo() {
		System.out.println("Cow 메서드");
	}
	/*
	void display() //에러: 부모의 메서드를 오버라이딩할 때 접근 제한자는 부모보다 넓어야 함
	{ }
	*/
}


public class InterfaceTest1 {
	public static void main(String[] args) {
		//IAnimal an = new IAnimal(); // error
		//인터페이스도 객체생성 불가
		
		Cat2 c = new Cat2();
		c.sound();
		c.showInfo();
		
		//Dog2 d = new Dog2(); //error
		//추상 클래스 객체 불가
		
		IAnimal ani = new Cow2();
		ani.sound();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.고양이 2.소 입력!");
		int type = sc.nextInt();
		
		IAnimal an = null;
		if(type == 1) {
			an = new Cat2();
		}else if(type == 2) {
			an = new Cow2();
		}else {
			System.out.println("잘못 입력");
			return;
		}
		
		an.sound();
		an.showInfo();
	}

}
