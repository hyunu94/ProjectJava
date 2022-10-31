package Corona3;

class rest{
	protected int rest;
}

//과일 판매자 클래스(과일 장사)
public class FruitSeller extends rest{
	//1.
	private int numOfApple; //사과개수
	private int myMoney; //판매수익
	private final int APPLE_PRICE; //사과 하나의 가격
	
	public FruitSeller(int numOfApple, int myMoney, int price) {
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		APPLE_PRICE = price; //final상수 - 생성자에서 단 한번 초기화 : 인스턴스별로 다른값 할당
	}
	
	public int getRest() {
		return rest;
	}
	/*
	public int saleApple(int money) { //사과를 판매하는 메서드 - 2000원 어치 사과주세요
		int num = money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		
		return num; //구매자에게 줄 사과개수
	}
	*/
	public FruitResult saleApple(int money) { //사과를 판매하는 메서드 - 2000원 어치 사과주세요
		int num = money/APPLE_PRICE;
		int change = money%APPLE_PRICE;
		
		FruitResult re = new FruitResult(num, change); //사과갯수 , 거스름돈
				
		numOfApple-=num;
		myMoney+=money-change;
		
		
		
		return re; //구매자에게 줄 사과개수
	}
	
	

	
	
	public void showSaleResult() { //추가된 메서드
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	
	}
}
