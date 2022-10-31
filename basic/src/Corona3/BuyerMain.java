package Corona3;

import java.util.Scanner;

public class BuyerMain {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//1. 100만원인 tv 구매
		Product tv = new TV(100);
		b.buy(tv);
		b.showInfo();
		
		//2. 200만원인 computer 구매
		Product com = new Computer(200);
		b.buy(com);
		b.showInfo();
		
		Scanner sc = new Scanner(System.in);
		Buyer bb = new Buyer(1000);
		while(true) {
			System.out.println("1.상품구매 2.구매내역조회 3.종료");
			int type = sc.nextInt();
			
			switch(type) {
				case 1:
					System.out.println("구매할 상품 선택 1. Tv 2.Computer");
					int kind = sc.nextInt();
					
					if(kind!=1 && kind!=2) {
						System.out.println("다시 선택!");
						continue;
					}
					
					System.out.println("상품 가격 입력!");
					int price = sc.nextInt();
					
					Product p = null;
					if(kind == 1) {
						p = new TV(price);
					}else if(kind == 2) {
						p = new Computer(price);
					}
					
					bb.buy(p); //배열에 저장됨
					bb.showInfo();
					break;
				case 2:
					bb.summary();
					break;
				case 3:
					System.out.println("종료함!");
					break;
				default:
					System.out.println("잘못 입력!");
					continue;
			}
		}
		

	}

}
