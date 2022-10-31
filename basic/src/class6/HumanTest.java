package class6;

import java.util.*;

class Human{
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

class Teacher extends Human{
	private String subject;
	
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void work() {
		System.out.println("가르친다");
	}
}

class Programmer extends Human{
	private int year;
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void work() {
		System.out.println("프로그래밍한다");
	}
	
}
public class HumanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름,나이,과목을 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String subject = sc.nextLine();
		
		Teacher tea = new Teacher();
		tea.setName(name);
		tea.setAge(age);
		tea.setSubject(subject);
		System.out.println("이름 : ");
		
	}

}
