package Practicer;

class Robot{
}

class DanceRobot extends Robot{
	public void dance() {
		System.out.println("춤을 춥니다");
	}
}

class SingRobot extends Robot{
	public void sing() {
		System.out.println("노래를 합니다");
	}
}

class DrawRobot extends Robot{
	public void draw() {
		System.out.println("그림을 그립니다");
	}
}

public class Test2 {
	public static void kind(Robot ro) {
		
		if(ro instanceof DanceRobot) {
			DanceRobot da = (DanceRobot)ro;
			da.dance();
		}else if(ro instanceof SingRobot) {
			SingRobot si = (SingRobot)ro;
			si.sing();
		}else if(ro instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)ro;
			dr.draw();
		}
	}
	public static void main(String[] args) {
		Robot ro = null;
		
		kind(ro);
	

	}

}
