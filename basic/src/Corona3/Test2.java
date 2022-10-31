package Corona3;

import java.util.*;

abstract class Employee{
	protected String name;
	
	Employee(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract double getPay();
}

class Permanent extends Employee{
	protected int salary , bonus;
	
	Permanent(String name,int salary,int bonus){
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public double getPay() {
		return salary+bonus;
	}
}

class Temporary extends Employee{
	protected int time , pay;
	
	Temporary(String name,int time,int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}
	
	public double getPay() {
		return time*pay;
	}
}

public class Test2 {
	public static void main(String[] args) {
		System.out.println("고용형태 - 고용직<p> , 임시직<t>를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		Employee emp = null;
		
		if(choice.equalsIgnoreCase("p")) {
			System.out.println("이름,기본급여,보너스를 입력하세요");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			int bonus = sc.nextInt();
			
			emp = new Permanent(name, salary, bonus);
			System.out.println("------------------------");
			System.out.println("고용형태 : 고용직 ");
			System.out.println("이름 : " + emp.getName());
			System.out.println("급여 : " + emp.getPay());
		}
		else if(choice.equalsIgnoreCase("t")) {
			System.out.println("이름,일한시간,시간당급여를 입력하세요");
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay = sc.nextInt();
			
			emp = new Temporary(name, time, pay);
			System.out.println("-----------------------");
			System.out.println("고용형태 : 임시직 ");
			System.out.println("이름 : " + emp.getName());
			System.out.println("급여 : " + emp.getPay());
		}
	}

}
