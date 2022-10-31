package Corona;

import java.util.Scanner;

public class PhoneInfoTest {
	public static void ques() {
		System.out.println("선택하세요..");
		System.out.println("1. 데이터 입력"); //1
		System.out.println("2. 전체 데이터 조회"); //2
		System.out.println("3. 데이터 검색"); //3
		System.out.println("4. 데이터 삭제"); //4
		System.out.println("5. 프로그램 종료"); //5
		System.out.print("선택 : ");
	}

	public static void main(String[] args) {
		PhoneInfo [] pho = new PhoneInfo [100];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			ques();
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 5) {
				break;
			}
			
			else if(choice == 1) {
				
				System.out.println("데이터 입력을 시작합니다..");
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("전화번호 : ");
				String tel = sc.nextLine();
				
				pho[count++] = new PhoneInfo(name,tel);
				System.out.println("데이터 입력이 완료되었습니다.");
			
			}else if(choice == 2) {
				System.out.println("데이터 입력을 시작합니다..");
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("전화번호 : ");
				String tel = sc.nextLine();
				System.out.print("전공 : ");
				String major = sc.nextLine();
				System.out.print("전공 : ");
				String year = sc.nextLine();
				
				pho[count++] = new PhoneUnivInfo(name,tel,major,year);
			
			}else if(choice == 3) {
				for(int i = 0 ; i<count;i++) 
					pho[i].call();
				}else if(choice == 3) {
					System.out.print("이름 : ");
					String name = sc.nextLine();
					
					for(int j = 0 ; j<count;j++) {
						if(pho[j].getName().equals(name)){
							pho[j].();
						}
					}
						
				}else if(choice == 4){
					System.out.print("이름 : ");
					String name = sc.nextLine();
					System.out.println("데이터가 삭제되었습니다");
					for(int i = 0 ; i<count;i++) {
						if(pho[i].getName().equals(name)){
							for(int j = i ; j<count;j++) {
								pho[j] =pho[j+1];
								}
						}
						count--;
					}
				}else if(choice == 5) {
					break;
				}else {
					System.out.println("다시 입력해주세요");
					continue;
				}
		}
	}

}

