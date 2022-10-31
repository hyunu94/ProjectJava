package Corona;

/*
  추상 메서드 (Abstract Method)
  - 몸체 없는 메서드 , 미완성 메서드
  - 메서드의 구현부가 없다는 것
  - 메서드 블럭{} 을 포함하지 않고 , 프로토타입만 존재하는 메서드
  예) public abstract void func1(int a);
  
  메서드의 내용이 상속받은 클래스에 따라 달라질 수 있기 때문에
  부모 클래스에서는 선언부만을 작성하고 , 실제 내용은 상속받는 클래스에서 구현하도록
  하는 것
  
  [2] 추상 클래스 
  미완성 클래스, 부분적으로만 완성된 클래스
  객체 생성 불가
  새로운 클래스를 작성하는데 있어서 바탕이 되는 부모 클래스로서 역할을 갖는다
  
  추상 클래스가 되는 방법
  1) 추상메서드를 하나라도 포함하고 있는 클래스
  2) 추상메서드를 포함하고 있지 않더라도 클래스 선언시 abstract 키워드를 포함하고 있을 경우
  
  추상 클래스 - 상속의 관계를 형성하기 위한 상위 클래스로
  인스턴스화시키기 위해서 정의한 클래스가 아닌 경우 추상클래스로 만든다
  
  추상 메서드 - 오버라이딩의 관계를 형성하기 위해 저의된 메서드,
  비어있는 메서드는 추상 메서드로 만든다
  
  추상메서드의 선언 형태
  public abstract void method();
  
  추상 클래스
  abstract class 클래스이름{
  	public abstract void method();
  }
  
  abstract class 클래스이름{
  	public void method();
  }
  
  자식 클래스에서 추상 클래스를 상속한 후 모든 추상 메서드들을 구현했을 때
  객체 생성 가능
  
  자식 클래스에서 구현하지 않는 추상 메서드가 남아 있다면 자식도 추상 클래스가 
  되어야 하며, 객체 생성 불가
 */

abstract class Animal1{
	public abstract void sound();
}

class Dog1 extends Animal1{
	public void sound() {
		System.out.println("멍멍!");
	}
}

abstract class Mammal extends Animal1{ //포유류
	//부모인 Animal의 무상 메서드 sound()를 오버라이딩 하지 않았으므로
	//자식도 추상 클래스
	public void breed(int n) {
		System.out.println(n+ "마리 새끼를 낳는다");
	}
}

class Cat1 extends Mammal{
	public void sound() {
		System.out.println("야옹~");
	}
}

public class AbstractTest1 {
	public static void main(String[] args) {
		//Animal an = new Animal(); // error : 추상 클래스 객체 생성 불가
//Multiple markers at this line - Cannot instantiate the type Animal
		
		//Mammal m = new Mammal(); // error
		
		Dog1 d = new Dog1();
		d.sound();
		
		Animal1 ani = new Dog1(); //추상클래스도 다형성 이용가능
		ani.sound();
		
		Mammal ma = new Cat1();
		ma.sound();
		ma.breed(3);
		
		ani = new Cat1();
		ani.sound();
	}

}
