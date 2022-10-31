package Corona3;

public class FruitMain {
	public static void main(String [] args) {
	FruitBuyer buyer = new FruitBuyer(10000);
	
	//buyApple()메서드 호출
	//1500원인 사과 30개를 가지고 있는 과일장사1에게 4500원어치 과일 구매
	//1000원인 사과 20개를 가지고 있는 과일장사2에게 2000원어치 과일 구매
	 
	FruitSeller seller1 = new FruitSeller(30,0,1500);
	FruitSeller seller2 = new FruitSeller(20,0,1000);
	
	buyer.buyApple(seller1,4500);
	buyer.buyApple(seller2,2000);
	
	 System.out.println("판매자1의 현재 상황");
	 seller1.showSaleResult();
	 
	 System.out.println("\n판매자2의 현재 상황");
	 seller2.showSaleResult();
	
	}
}
