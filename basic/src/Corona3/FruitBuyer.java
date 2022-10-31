package Corona3;

public class FruitBuyer {
	int myMoney; //남은 돈
	private int numOfApple; //구매한 사과 개수
	
	public FruitBuyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public int getmyMoney() {
		return myMoney;
	}
	
	//사과를 구매하는 메서드
	public void buyApple(FruitSeller seller,int money) {
		//구매대상,구매 금액 필요 = > 매개변수로 전달되어야 함
		//아저씨 , 사과 2000원 어치 주세요
		FruitResult fr = seller.saleApple(money);
		int num = fr.getNum();
		int change = fr.getChange();
		
		numOfApple+=num;
		myMoney-=money-change;
		
	}
	
	public void showBuyResult() {
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과 개수 : " + numOfApple);
	}
	

}
