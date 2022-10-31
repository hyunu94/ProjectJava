package Practice5;

import java.util.Scanner;

class Rectangle{
	private int lon , high;
	
	Rectangle(int lon,int high){
		this.lon = lon;
		this.high = high;
	}
	
	public int area() {
		return lon*high;
	}
	
	public int reigh() {
		return 2*(lon+high);
	}
}

public class Rectangle3 {
	public static void main(String[] args) {
		System.out.println("사각형의 가로,세로를 입력!");
		Scanner sc = new Scanner(System.in);
		int lon = sc.nextInt();
		int high = sc.nextInt();
		
		Rectangle rec = new Rectangle(lon,high);
		System.out.println("사각형의 넓이 : " + rec.area());
		System.out.println("사각형의 둘레 : " + rec.reigh());

	}

}
