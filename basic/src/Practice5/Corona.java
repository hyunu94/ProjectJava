package Practice5;

class Car {
	private String color;	// 색상
	private String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	private int door;		// 문의 개수

	Car() {
		this("gray" , "manuel" , 2);
		//(1) 회색, 수동, 문 2개인 차로 셋팅

			
	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public void showInfo(){
		System.out.println("color:" + color + ", gearType:" + gearType+ ", door:"+door);
	}
}

public class Corona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
