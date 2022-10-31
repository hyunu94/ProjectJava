package Corona2;

interface Attackable{//지정된 대상(unit)을 공격하는 기능
	public abstract void attack(Unit2 u); 
	}

interface Movable{
	void move(int x, int y); //지정된 위치(x,y)로 이동하는 기능
	}	

//인터페이스끼리의 상속도 가능-extends 키워드 이용, 다중상속이 가능함
interface Fightable extends Attackable, Movable{
}

abstract class Unit2{
	protected int x; //유닛의 위치(x좌표)
	protected int y; //유닛의 위치(y좌표)
	protected int currentHP; //유닛의 체력
	
	Unit2(int x, int y, int currentHP){
		this.x=x;
		this.y=y;
		this.currentHP=currentHP;
	}
}//class

//클래스 상속과 인터페이스 구현을 동시에 할 수 있다
class Fighter extends Unit2 implements Fightable{
	Fighter(int x, int y, int currentHP){
		super(x, y, currentHP);
	}
	
	public void move(int x, int y){
	this.x=x;
	this.y=y;
	System.out.println(x+","+y+"위치로 이동합니다");
	}	

	public void attack(Unit2 u){
		System.out.println(u.x +","+ u.y +"위치에 있고, "+u.currentHP+"의 체력을 갖는 유닛을 공격합니다");
	}
}//class

public class FighterTest {
	public static void main(String[] args) {
		Fighter f= new Fighter(11, 33, 300);
		f.move(40,50);

		//40,50 위치에 있는 다른 파이터 공격 후 70,80 위치로 이동
		Fighter f2 = new Fighter(15,40,50);
		f.attack(f2);
		f.move(70,80);
		//70,80 위치에 있는 또 다른 유닛 공격
		Fighter f3 = new Fighter(18,40,60);
		f.attack(f3);
		
		//자식 instance 부모 => true, 자식은 부모의 인스턴스이기도 하다
		System.out.println(f instanceof Unit2);
		
		if(f instanceof Unit2) {
			System.out.println("f는 Unit2의 인스턴스이기도 하다");
		}
		
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현했다");
		}
		
		if(f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스를 구현했다");
		}
		
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스를 구현했다");
		}
		
		if(f instanceof Object) {
			System.out.println("f는 Object 인터페이스를 구현했다");
		}
		
		
	}

}
