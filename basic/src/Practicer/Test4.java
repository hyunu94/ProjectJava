package Practicer;

import java.util.Scanner;

class Account{
protected String accNo;
protected double balance;

public Account(String accNo, double balance){
	this.accNo = accNo;
	this.balance = balance;
	}

	public void deposit(double money){ //입금
		balance += money;
	}
	
	public void withdraw(double money){ //출금
		balance -= money;
	}
	
	public void display(){
		System.out.println("계좌번호:"+accNo);
		System.out.println("계좌잔액:"+balance);
	}
}

class FaithAccount extends Account{
	FaithAccount(String accNo, double balance){
		super(accNo,balance+balance*0.01);
	}
	
	public void deposit(double money) {
		balance += money + money * 0.01;
	}
}

class ContriAccount extends Account{
	private static double contribution; // 기부금 총액
	
	ContriAccount(String accNo,double balance){
		super(accNo,balance-balance*0.01);
		contribution = balance*0.01;
	}
	
	public void deposit(double money) {
		super.deposit(money-money*0.01);
		contribution += money*0.01;
	}
	
	public void contri() {
		System.out.println("총 기부액 : " + contribution);
	}
}	

	

public class Test4 {
	public static void main(String[] args) {
		System.out.println("에잇 해라");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		String num = sc.nextLine();
		int money = sc.nextInt();
		
		System.out.println("===========");
		Account acc = new Account(num,money);
		acc.display();
		
		if
		
	}
}
