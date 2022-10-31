package practice11;

abstract class Shape {
	protected Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	Point getP() {
		return p;
	}
	
	void setP(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
}

class Point {
	private int x;
	private int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String findInfo() {
		return "["+x+","+y+"]";
		}
}

class Circle extends Shape{ //클래스를 작성하시오
	private double r;
	
	Circle(){
		
	}
	
	Circle(double r){
		this.r = r;
	}
	
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		this.r=r;
	}
	
	public double calcArea() {
		return r*r*3.14;
	}
}
class Rect extends Shape{ //클래스를 작성하시오
	private int width , height;
	
	Rect(){
	}

	
	Rect(int width , int height){
		this.width = width;
		this.height = height; 
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getHeight() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public double calcArea() {
		return width * height;
	}
	
	public boolean isSquare() {
		boolean bool = true;
		if(width==height) {
			bool = true;
		}else {
			bool = false;
		}
		return bool;
	}
	
	
}

