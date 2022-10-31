package class6;

import java.util.*;

public class BookSalesTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("책제목, 수량, 단가를 입력하세요");
			String name = sc.nextLine();
			int num = sc.nextInt();
			int price = sc.nextInt();
			
			BookSales book = new BookSales(name,num,price);
			int sell = book.sell();
			book.total();
			
			
			System.out.println("판매금액 = " + sell + ", 누적판매금액 : " + BookSales.getTotal());
			System.out.println("그만하시겠습니까?<Q>uit");
			sc.nextLine();
			String stop = sc.nextLine();
			if(stop.equalsIgnoreCase("q")) break;
		}
	}

}
