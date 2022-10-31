package Corona;
class Employee {
	protected String name;
	
	Employee(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double findPay() {
		return 0;
	}
}

class Permanent extends Employee{
	protected int salary;

	Permanent(String name,int salary){
		super(name);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public double findpay() {
		return getSalary();
	}
	
	public void result() {
		System.out.println("=====================");
		System.out.println("고용형태 : 고용직 ");
		System.out.println("이름 : " + getName());
		System.out.println("급여 : " + findpay());
	}
}

class SalesPerson extends Permanent{
	private double earnings;
	private final double RATE = 0.15;
	
	SalesPerson(String name , int salary , double earnings){
		super(name,salary);
		this.earnings = earnings;
	}
	
	public double getEarnings() {
		return earnings;
	}
	
	public double findpay() {
		return getSalary() + (getEarnings()*RATE);
	}
	
	public void result() {
		System.out.println("==========================");
		System.out.println("고용형태 : 판매직");
		System.out.println("이름 : " + getName());
		System.out.println("급여 : " + findpay());
	}
	
}

class Temporary extends Employee{
	private int time , pay;
	
	Temporary(String name , int time , int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}
	
	public int getTime() {
		return time;
	}
	
	public int getPay() {
		return pay;
	}
	
	public double findpay() {
		return getTime()*getPay();
	}
	
	public void result() {
		System.out.println("==========================");
		System.out.println("고용형태 : 임시직");
		System.out.println("이름 : " + getName());
		System.out.println("급여 : " + findpay());
	}
}