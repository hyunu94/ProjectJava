package PolymoTest3;

public class ClassArgsTest{
	public static double add(int a, double b) {
		return a+b;
	}
	
	//1.매개변수가 클래스인 경우
	public static void func1(Circle c) {
		//참조변수가 보이면 참조변수.메서드명()
		c.draw();
		c.delete();
		c.sayCircle();
	}
	
	//2. 매개변수의 다형성
	public static void func2(Shape sh) {
		sh.draw();
		sh.delete();
	}
	
	//3. 반환타입이 클래스인 경우
	// 반환타입이 Circle(클래스)이면 Circle 객체가 리턴된다
	public static Circle func3() {
		Circle c= new Circle();
		return c;
	}
	
	//4. 반환타입에 다형성 이용
	//반환타입이 Shape(부모)이면 자식객체가 리턴된다
	public static Shape func4(int type) {
		Shape sh=null;
		if(type==1) {
			sh = new Circle();
		}else if(type ==2 ) {
			sh = new Triangle();
		}
		return sh;
	}

	public static void main(String[] args) {
		double d = add(10,3.14);
		
		/*
		 메서드 호출방법
		 -매개변수가 int면 main에서 int값을 넣는다
		 		String 이면 		String값을 넣는다
		 		Circle이면 		Circle을 넣는다
		 						어떻게 넣나? "new"로 객체생성해서 넣는다
		 		Shape(부모)이면 자식객체를 넣는다
		 */
		//1. 매개변수가 클래스인 메서드 호출
		func1(new Circle());
		
		Circle c = new Circle();
		func1(c);
		
		//2. 매개변수가 부모클래스인 메서드 호출
		func2(new Triangle());
	
		Shape sh = new Circle();
		func2(sh);
		
		//3. 반환타입이 클래스인 메서드 호출
		Circle c2= new Circle();
		c2 = func3();
		c2.draw();
		
		//4. 반환타입에 다형성이 이용된 메서드 호출
		Shape sh2 = func4(2);
		sh2.draw();
		sh2.delete();
	}

}
