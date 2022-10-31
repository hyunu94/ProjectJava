package class5;

class Calculator1{
	public float plus(float a , float b) {
		return a+b;
	}
	public float minus(float a , float b) {
		return a-b;
	}
	public float gob(float a , float b) {
		return a*b;
	}
	public float gam(float a , float b) {
		return a/b;
	}
}
	
public class Calculator {
	
	public static void main(String[] args) {
		float a = 3.14f , b = 3.15f;
		
		Calculator1 cal = new Calculator1();
		double c = cal.plus(a, b);
		double d = cal.minus(a, b);
		double e = cal.gob(a, b);
		double f = cal.gam(a, b);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}	

}
