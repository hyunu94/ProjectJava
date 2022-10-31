package Corona;

import java.util.Scanner;

class Sale1{
	private int num , price;
	
	Sale1(int num,int price){
		this.num = num;
		this.price = price;
	}
	
	public String coupon() {
		String result ="";
		if(num>=30 || price>=3000000) {
			result = "20% 할인쿠폰이 지급되었습니다";
		}else {
			result = "미해당 입니다";
		}
		return result;
	}
}

public class Test1 {

	public static void main(String[] args) {
		System.out.println("거래횟수와 거래금액을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int price = sc.nextInt();
		
		Sale1 sal = new Sale1(num,price);
		String result = sal.coupon();
		System.out.println(result);
	}

}
