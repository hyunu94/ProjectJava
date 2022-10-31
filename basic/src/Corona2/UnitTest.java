package Corona2;
abstract class Unit{
	protected int x, y;  //현재 위치
	
	abstract public void move(int x, int y); 
	
	public void stop() {
		System.out.println("현재 위치에 정지합니다.");
	}
}

class Marine extends Unit{  //보병
	public void move(int x, int y) {
		//지정된 위치로 이동
		this.x=x;
		this.y=y;
		System.out.println("보병이 " +x +", "+ y +"위치로 이동한다.");
	}
	
	public void stimPack() {
		System.out.println("스팀팩을 사용합니다.");
	}
}

class Tank extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("탱크가 " +x +", "+ y +"위치로 이동한다.");
	}
	
	public void changeMode() {
		System.out.println("공격모드를 변환합니다.");
	}
}

class Dropship extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("수송선의 위치를 " +x +", "+ y +"로 이동한다.");
	}
	
	public void load() {
		System.out.println("선택된 대상을 태웁니다");
	}
	
	public void unload() {
		System.out.println("선택된 대상을 내립니다");
	}
}

public class UnitTest {

	public static void main(String[] args) {
		//Unit u = new Unit(); // error
		
		//Unit 배열 만들고, 4개의 요소 넣은 후
		//for, 확장 for에서 move() 메서드 호출
		Unit[] arr = new Unit[4];
		arr[0]=new Marine();
		arr[1]=new Tank();
		arr[2]=new Dropship();
		arr[3]=new Marine();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].move(15, 40);
		}
		
		System.out.println("\n=======확장 for======");
		for(Unit u: arr) {
			u.move(70, 90);
		}
		
		System.out.println("\n======downcasting=========");
		//다운 캐스팅 이용, 자식만의 메서드 호출
		for(int i=0;i<arr.length;i++) {
			//arr[i].stimPack(); //error
			if(arr[i] instanceof Marine) {
				Marine m = (Marine)arr[i];
				m.stimPack();
			}else if(arr[i] instanceof Tank) {
				Tank t = (Tank)arr[i];
				t.changeMode();
			}else if(arr[i] instanceof Dropship) {
				Dropship d = (Dropship)arr[i];
				d.load();
				d.unload();
			}			
		}	
	}
}
