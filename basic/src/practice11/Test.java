package practice11;

public class Test {
	public static void main(String[] args) {
		Child ch = new Child(15);
		Child ch2 = new Child(9);
		System.out.println("게임 전 구슬의 보유 개수");
		System.out.println("==어린이1==");
		ch.showProperty();
		System.out.println("==어린이2==");
		ch2.showProperty();
		
		System.out.println("\n1차 게임 후 구슬의 보유 개수");
		ch2.loseBead(2);
		ch.obtainBead(ch, 2);
		System.out.println("==어린이1==");
		ch.showProperty();
		System.out.println("==어린이2==");
		ch2.showProperty();
		
		System.out.println("\n2차 게임 후 구슬의 보유 개수");
		ch.loseBead(7);
		ch2.obtainBead(ch2, 7);
		System.out.println("==어린이1==");
		ch.showProperty();
		System.out.println("==어린이2==");
		ch2.showProperty();

	}

}
