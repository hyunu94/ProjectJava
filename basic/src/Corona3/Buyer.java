package Corona3;

//고객 - 제품 구매자
public class Buyer {
	private int myMoney;
	private int myPoint;
	private final int MAX_COUNT=10;
	//구매한 상품을 저장할 배열
	private Product[] pdArr = new Product[MAX_COUNT]; 
	private int index;
	
	public Buyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	//제품을 구매하는 메서드
	public void buy(Product p) {
		if(myMoney < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다");
			return;
		}
		
		//잔고는 줄고, 포인트는 늘어감
		this.myMoney -=  p.getPrice();	//제품 가격
		this.myPoint +=	p.getPoint();	//제품 포인트
		
		//구매한 상품을 배열에 저장한다
		pdArr[index++] = p;
		System.out.println(p.findInfo() + " 을(를) 구매하였습니다.");
	}
	
	public void showInfo() {
		System.out.println("\n=============구매자========================");
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("포인트 : " + myPoint + "\n");
	}
	
	public void summary() {
		//구매한 상품명과 가격의 합계 출력
		int sum = 0;
		String itemList = "";
		
		for(int i=0;i<index;i++) {
			sum += pdArr[i].getPrice();
			itemList += pdArr[i].findInfo() +" ";
		}
		
		System.out.println("\n구매한 상품의 총 금액 : " + sum);
		System.out.println("구매한 상품 : " + itemList);
	}
}
