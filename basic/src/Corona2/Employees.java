package Corona2;

import java.util.Scanner;

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

public class Employees{
	public static void main(String[] args) {
		System.out.println("고용형태 - 고용직<P> , 임시직<T>을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		Employee emp = null;
		
		if(choice.equalsIgnoreCase("p")) {
			System.out.println("이름,기본급여,보너스를 입력하세요");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			int bonus = sc.nextInt();
			emp = new Permanent(name,salary,bonus);
			((Permanent) emp).result();
		}else if(choice.equalsIgnoreCase("t")){
			System.out.println("이름,일한시간,시간당급여를 입력하세요");
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay = sc.nextInt();
			emp = new Temporary(name,time,pay);
			((Temporary) emp).result();
		}

	}

}
