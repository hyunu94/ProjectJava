package Corona3;

import java.util.Scanner;

class Account{
	protected String accNo;
	protected double balance;
	
	public Account(String accNo, double balance){
		
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void deposit(double money){
		balance += money;
	}
	
	public void withdraw(double money){
		balance -= money;
	}
	
	public void display(){
		System.out.println("계좌번호:"+accNo);
		System.out.println("계좌잔액:"+balance);
	}
}

class FaithAccount extends Account{
	FaithAccount(String accNo, double balance){
		super(accNo,balance);
		double faith = balance+balance*0.01;
	}
	
	public void deposit(double money) {
		balance += money + money * 0.01;
	}
}

class ContriAccount extends Account{
	private static double contribution;
	
	ContriAccount(String accNo, double balance){
		super(accNo,balance);
		contribution = balance*0.01;
	}
	
	public void deposit(double money) {
		super.deposit(money-money*0.01);
		contribution += money*0.01;
	}
	
	public void display() {
		System.out.println("계좌번호:"+accNo);
		System.out.println("계좌잔액:"+(balance-balance*0.01));
		System.out.println("총 기부액:"+contribution);
	}
}

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("개절할 계좌종류 - 일반계좌<A> , 신용계좌<F> , 기부계좌<C>, 계좌번호, 잔액을 입력하세요");
		String choice = sc.nextLine();
		String accNo = sc.nextLine();
		double balance = sc.nextDouble();
		System.out.println("======================================");
		Account acc = null;
		
		if(choice.equalsIgnoreCase("a")) {
			acc = new Account(accNo,balance);
			acc.display();
			
			System.out.println("입금할 금액을 입력하세요");
			Double money = sc.nextDouble();
			acc.deposit(money);
			acc.display();
			
		}else if(choice.equalsIgnoreCase("f")) {
			acc = new Account(accNo,balance);
			acc.display();
			
			acc = new FaithAccount(accNo, balance);
			System.out.println("입금할 금액을 입력하세요");
			Double money = sc.nextDouble();
			acc.deposit(money);
			acc.display();
			
		}else if(choice.equalsIgnoreCase("c")) {
			acc = new ContriAccount(accNo, balance);
			acc.display();
			
			acc = new ContriAccount(accNo, balance);
			System.out.println("입금할 금액을 입력하세요");
			Double money = sc.nextDouble();
			acc.deposit(money);
			acc.display();
		}
		

	}

}
