package class6;

import java.util.*;

public class FoodsaleTest {

	public static void main(String[] args) {
		double sum = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴, 수량 , 단가를 입력하세요");
			String menu = sc.nextLine();
			int num = sc.nextInt();
			int price = sc.nextInt();
			
			Foodsale food = new Foodsale(menu,num,price);
			System.out.println("판매가격 : " + food.sell());
			sum += food.sell();
			
			sc.nextLine();
			System.out.println("그만하시겠습니까? <q>uit");
			String choose = sc.nextLine();
		
			if(choose.equalsIgnoreCase("Q")) {
				break;
			}
			
		}
		System.out.println("판매금액 : " +sum);
	}

}