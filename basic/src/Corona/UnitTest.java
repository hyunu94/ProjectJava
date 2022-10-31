package Corona;

class Unit{
	protected int x,y; // 현재위치
	
	public void move(int x, int y) {
		System.out.println("이동하는 메서드"); //Unit 클래스를 상속받아서 작성되는 클래스는 
		//move 메서드를 자신의 클래스에 알맞게 구현해야 한다
	}
	
	public void stop(int x, int y) {
		System.out.println("현재 위치에 저장합니다.");
	}
}

class Marine extends Unit{
	public void move(int x,int y) {
		/*지정된 위치로 이동*/
		this.x=x;
		this.y=y;
		System.out.println("보병이 " +x+","+y+"위치로 이동한다");
	}
	public void stimPack() { 
	}
}

class Tank extends Unit{
	public void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("탱크가 "+x+","+y+"위치로 이동한다");
	}
	
	public void changeMode1(){
		public void move1(int x,int y) {
			this.x=x;
			this.y=x;
			System.out.println("탱크가 "+x+","+y+"위치로 이동한다.");
		}
		public void changeMode() {
		}
	}
}

class Dropship extends Unit{
	public void move(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println("수송선의 위치를 "+x+","+y+"로 이동한다.");
		}
		public void load(){/* 선택된 대상을 태운다 */}
		public void unload(){/* 선택된 대상을 내린다 */}

}

public class UnitTest {
	public static void main(String[] args) {
		Unit[] group = new Unit[4];
		group[0]=new Marine();
		group[1]=new Tank();
		group[2]=new Marine();
		group[3]=new Dropship();
		
		for(int i=0;i<group.length;i++) {
			group[i].move(15,40);
		}
		
		for(Unit n : group) {
			n.move(15,40);
		}
		
		//다운 캐스팅 이용, 자식만의 메서드 호출
		for(int i=0;i<group.length;i++) {
			//group[i].stimPack(); //error
		if(group[i] instanceof Marine) {
			
		}
		
		}
	}

}
