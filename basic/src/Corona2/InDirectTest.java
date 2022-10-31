package Corona2;

/*
 간접적인 관계의 두 클래스(A - I - B)
 -클래스 A가 클래스 B를 직접 호출하지 않고 인터페이스를 매개체로 하는 경우
 클래스 A는 인터페이스 I 하고만 직접적인 관계에 있기 때문에
 클래스 B의 영향을 받지 않음
 
 => 클래스와 클래스간의 직접적인 관계를 인터페이스를 이용해서 간접적인 관계로 변경하면, 
 한 클래스의 변경이 관련된 다른 클래스에 영향을 미치지 않는 독립적인 프로그래밍이 가능하다.
 */

interface I{
	public void method();
}

class AA{
	public void methodA(I i) {
		i.method();
	}
}

class BB implements I{
	public void method() {
		System.out.println("BB 클래스의 메서드!");
	}
}

class CC implements I{
	public void method() {
		System.out.println("CC 클래스의 메서드!");
	}
}

public class InDirectTest {
	public static void main(String[] args) {
		AA a = new AA();
		//methodA()호출
		//a.methodA(new BB());
		a.methodA(new CC());

	}

}
