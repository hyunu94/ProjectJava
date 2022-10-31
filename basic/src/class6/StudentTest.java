package class6;

import java.util.*;

public class StudentTest{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student [] str = new Student[100];
		int count = 0;
		
		while(true) {
			System.out.println("1.저장 2.전체학생 조회 3.종료 선택");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("이름,학번을 입력하세요");
				sc.nextLine();
				String name = sc.nextLine();
				String idNo = sc.nextLine();
				
				Student stu = new Student(name,idNo);
				str[count] = stu;
				count++;
			}else if(choice == 2) {
				for(int i =0;i<count;i++) {
					str[i].showInfo();
				}
			}else if(choice == 3 ) {
				break;	
			}else{
				System.out.println("다시 입력하세요");
			}
		}//while
	}
}