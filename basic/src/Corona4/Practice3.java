package Corona4;

abstract class Shape {
	protected Point p;

	Shape(Point p) {
		this.p = p;
	}
	
	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public abstract double calcArea();  // 도형의 면적을 계산해서 반환하는 메서드

	public void showInfo(){ 
		 // 도형의 원점 x, y를 출력하시오.
		
	}
}//class

class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String findInfo() {
		return "["+x+","+y+"]";
	}
}

class Rect extends Shape { //클래스를 작성하시오}
	private int width , height;
	
	Rect(int width , int height, Point p){
		super(p);
		this.width = width;
		this.height = height;
	}
	
	
	public double calcArea() {
		return width * height;
	}
	
	public 
}
class Circle extends Shape { //클래스를 작성하시오}
	
}
class Exercise{

	// sumArea 메서드를 작성하시오

	public static void main(String[] args){
		Shape[] arr = new Shape[3];
		arr[0] = new Circle(new Point(0,0), 5.2);
		arr[1] = new Rect(new Point(10,20), 3, 4);
		arr[2] = new Circle(new Point(30,40), 1);

		System.out.println("면적의 합:"+sumArea(arr));
	}
}
public class Practice3 {
	public static void main(String[] args) {
	

	}

}
