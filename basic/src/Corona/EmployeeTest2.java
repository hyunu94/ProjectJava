package Corona;

import java.util.*;
public class EmployeeTest2 {
	public static void main(String[] args) {
		System.out.println("고용형태 - 고용직<p> , 임시직<t> , 판매직<s>를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("p")) {
			System.out.println("이름,기본 급여를 입력하세요");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			
			Permanent per = new Permanent(name, salary);
			per.result();
		}
		
		else if(choice.equalsIgnoreCase("t")) {
			System.out.println("이름 , 일한시간 , 시간당 급여를 입력하세요");
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay = sc.nextInt();
			
			Temporary tem = new Temporary(name, time, pay);
			tem.result();
		}
		
		else if(choice.equalsIgnoreCase("s")){
			System.out.println("이름 , 기본급여 , 판매수익을 입력하세요");
			String name = sc.nextLine();
			int time = sc.nextInt();
			double earnings = sc.nextDouble();
			
			SalesPerson sale = new SalesPerson(name, time,earnings);
			sale.result();
		}
		
	}

}
