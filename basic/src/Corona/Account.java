package Corona;

class Account {
	protected String accNo; //계좌번호
	protected double balance; // 잔액
	
	public Account(String accNo, double balance){
	this.accNo = accNo;
	this.balance = balance;
	}
	
	public void deposit(double money){//입금
	balance += money;
	}
	
	public void withdraw(double money){ //출금
	balance -= money;
	}
	
	public void display(){
		
	System.out.println("계좌번호:"+accNo);
	System.out.println("계좌잔액:"+balance);
	}
}//account

class FaithAccount extends Account{
	private static double plus;
	
	FaithAccount(String accNo,double balance){
		super(accNo,balance);
	}
	
	public static void plus(double balance) {
		FaithAccount.plus = (balance*0.01);
	}
	
	public void deposit(double money) {
		balance += money + plus;
	}
}

class ContriAccount extends Account{
	private static double minus;
	private static double contribution;

	ContriAccount(String accNo,double balance){
		super(accNo,balance);
		balance = (balance-(balance*0.01)); //잔액-잔액*0.01
		}
	
	public void deposit(double money) {
		super.deposit(money-money*0.01); // 입금액 - 입금액*0.01
	}
	
	public double Contribute(double money) {
		contribution += money*0.01;
		return contribution;
	}
	
	public void display() {
		super.display();
		System.out.println("총 기부액 : " + contribution);
	}
}