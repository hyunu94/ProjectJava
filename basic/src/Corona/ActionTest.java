package Corona;

class Robot {}
class DanceRobot extends Robot {
	public void dance() {
		System.out.println("춤을 춥니다.");
		}
}

class SingRobot extends Robot {
	public void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	public void draw() {
		System.out.println("그림을 그립니다.");
	}
}	

public class ActionTest {

	//(1) action()메서드를 작성하시오
	public static void action(Robot arr) {
	}
	
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		
			
		//1.
			for(int i = 0;i<arr.length;i++) {
				//자식만의 메서드 호출
				if(arr[i] instanceof DanceRobot) {
					action(arr);
				}else if(arr[i] instanceof SingRobot)
			
			
			//확장 for
			for() {
				
			}
			
			//2.
			
			}
		
		
		
		
	} // main
}



