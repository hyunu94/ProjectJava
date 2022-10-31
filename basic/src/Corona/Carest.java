package Corona;

import java.util.*;

class Car2{
	public void engine() {
		
	}
	
	public void kind() {
		
	}
}

class Equus extends Car2{
	public void engine() {
		System.out.println("에쿠스 엔진");
	}
	
	public void kind() {
		System.out.println("에쿠스!");
	}
}

class Benz extends Car2{
	public void engine() {
		System.out.println("벤츠 엔진");
	}
	
	public void kind() {
		System.out.println("벤츠!");
	}
}

public class Carest {
	public static void main(String[] args) {
		System.out.println("차종을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Car2 c = null;
		
		switch(num) {
			case 1 :
			c = new Equus();
			break;
			
			case 2:
			c = new Benz();
			break;
		}
		
		c.engine();
		c.kind();
	}

}
