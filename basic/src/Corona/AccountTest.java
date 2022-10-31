package Corona;

import java.util.*;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("개설할 계좌종류-일반계좌<A> , 신용계좌<F> , 기부계좌<C> , 계좌번호 , 잔액을 입력하세요\n");
		String choice = sc.nextLine();
		String accNo = sc.nextLine();
		int balance = sc.nextInt();
		
		System.out.println("=================================");
		Account acc = new Account(accNo,balance);
		acc.display();
		if(choice.equalsIgnoreCase("a")) {
			System.out.println("입금할 금액을 입력하세요");
			int money = sc.nextInt();
			acc.deposit(money);
			acc.display();
		}
		
		else if(choice.equalsIgnoreCase("f")){
			System.out.println("입금할 금액을 입력하세요");
			int money = sc.nextInt();
			acc = new FaithAccount(accNo, balance);
			FaithAccount.plus(balance);
			acc.deposit(money);
			acc.display();
		}
		
		else if(choice.equalsIgnoreCase("c")) {
			System.out.println("입금할 금액을 입력하세요");
			int money = sc.nextInt();
			acc = new ContriAccount(accNo, balance);
			acc.deposit(money);
			acc.display();

		}
	}

}
