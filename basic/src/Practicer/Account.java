package Practicer;

interface grade{
	double A = 0.03;
	double B = 0.02;
	double C = 0.01;
	
	
}

public class Account {
	protected String num; //계좌번호
	protected int money; //잔액
	protected String name; //고객이름
	
	Account(String num,int money,String name){
		this.num = num;
		this.money = money;
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void plus(int put) {
		money += put;
	}
	
	public int minus(int pot) {
		if(pot>money) {
			return 0;
		}else {
			money-= pot;
			return pot;
		}
	}
	
	public void count() {
		System.out.println("계좌번호 : " + getNum() );
		System.out.println("잔액 : " + getMoney());
		System.out.println("고객이름 : " + getName());
	}
}

class NormalAccount extends Account { //보통예금
	protected int per; //이자율
	
	NormalAccount(String num,int money,String name,int per){
		super(num,money,name);
		this.per = per;
	}
	
	public void plus(int put) {
		money += put;
		money += put*(0.01*per);
	}
	
	public void count() {
		super.count();
		System.out.println("이자율 : " + (per*0.01));
	}
}

class HighCreditAccount extends NormalAccount implements grade{ //신용신뢰계좌
	private double special; //특별 이자율
	
	HighCreditAccount(String num,int money,String name,int per , int special){
		super(num,money,name,per);
		if(special == 1) {
			this.special = A;
		}else if(special == 2) {
			this.special = B;
		}else if(special == 3) {
			this.special = C;
		}
	}
	
	public void plus(int put) {
		money += put;
		money += put*(0.01*per);
		money += put*(0.01*special);
	}
	
	public void count() {
		super.count();
		System.out.println("특별 이자율 : " + special +"%");
	}
}

