package class5;

import java.util.*;

class Circle{
	double r;
	
	public void area(){
		System.out.println(r*r*3.14);
	}
	
	public void rough() {
		System.out.println(r*2*3.14);
	}
	
}

public class page23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요");
		double r = sc.nextInt();
		
		Circle arr = new Circle();
		arr.r=r;
		arr.area();
		arr.rough();
	}

}
