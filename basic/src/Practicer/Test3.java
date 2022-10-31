package Practicer;

abstract class Employee {
	protected String name;
	
	Employee(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	abstract double getPay();
	
}

class Permanent extends Employee{
	protected int salary , bonus;

	Permanent(String name,int salary,int bonus){
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public double getPay() {
		return getSalary() + getBonus();
	}
	
	public void result() {
		System.out.println("=====================");
		System.out.println("고용형태 : 고용직 ");
		System.out.println("이름 : " + getName());
		System.out.println("급여 : " + getPay());
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
	
	public int getpay() {
		return pay;
	}
	
	public double getPay() {
		return getTime()*getpay();
	}
	
	public void result() {
		System.out.println("==========================");
		System.out.println("고용형태 : 임시직");
		System.out.println("이름 : " + getName());
		System.out.println("급여 : " + getPay());
	}
}


public class Test3 {
	public static void main(String[] args) {
		

	}

}
