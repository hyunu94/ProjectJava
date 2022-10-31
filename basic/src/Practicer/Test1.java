package Practicer;

import java.util.*;

class Car{
	public void Engine() {
		
	}
	
	public void kind() {
		
	}
}

class Equus extends Car{
	public void Engine() {
		System.out.println("에쿠스 엔진");
	}
	
	public void kind() {
		System.out.println("에쿠스!");
	}
}

class Benz extends Car{
	public void Engine() {
		System.out.println("벤츠 엔진");
	}
	
	public void kind() {
		System.out.println("벤츠!");
	}
}

public class Test1 {
	public static void know(int num) {
		Car ca = null;
		if(num == 1) {
			ca = new Equus();
		}else if(num == 2) {
			ca = new Benz();
		}
		ca.Engine();
		ca.kind();
	}
	public static void main(String[] args) {
		System.out.println("차종을 선택하세요<1:에쿠스, 2:벤츠");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		know(num);
		
		
		
	}

}
