package Corona2;

/*
	직접적인 관계의 두 클래스 (A-B)
	-직접적인 관계의 두 클래스는 한쪽(Provider)이 변경되면
	이를 사용하는 다른 한 쪽(User)도 변경되어야 함
	
		A  -> 	B
 	  (User)  (Provider)
 */

class A{
	/*public void methodA(B b) {
		b.method();
	}
	*/
	public void methodA(C c) {
		System.out.println("C 클래스의 메서드");
	}
}

class B{
	public void method() {
		System.out.println("B 클래스의 메서드");
	}
}

class C{
	public void method() {
		System.out.println("C 클래스의 메서드");
	}
}

public class DirectTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		//methodA() 호출
		//a.methodA(new C());
		a.methodA(new C());
	}

}
