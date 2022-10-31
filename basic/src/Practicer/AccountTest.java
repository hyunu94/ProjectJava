package Practicer;

import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> list = new ArrayList<>();

		while (true) {
			System.out.println("----Menu------");
			System.out.println("1.계좌개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.계좌정보 전체 출력");
			System.out.println("5.프로그램 종료");
			int choice = sc.nextInt(); // 메뉴선택
			if (choice == 1) {
				System.out.println("1.보통예금계좌");
				System.out.println("2.신용신뢰계좌");
				int choice2 = sc.nextInt();

				if (choice2 == 1) {
					System.out.print("계좌ID : ");
					String num = sc.nextLine();
					System.out.print("이름 : ");
					String name = sc.nextLine();
					System.out.print("입금액 : ");
					int put = sc.nextInt();
					System.out.print("이자율 : ");
					int per = sc.nextInt();

					list.add(new NormalAccount(num, put, name, per));
				} else if (choice2 == 2) {
					System.out.print("계좌ID : ");
					String num = sc.nextLine();
					System.out.print("이름 : ");
					String name = sc.nextLine();
					System.out.print("입금액 : ");
					int put = sc.nextInt();
					System.out.print("이자율 : ");
					int per = sc.nextInt();
					System.out.print("신용등급<1toA, 2toB, 3toC");
					int special = sc.nextInt();

					list.add(new HighCreditAccount(num, put, name, per, special));
				}
				break;
			} else if (choice == 2) { // 2번 선택
				System.out.print("계좌ID : ");
				String num = sc.nextLine();
				System.out.print("입금액 : ");
				int put = sc.nextInt();

				boolean bool = false;
				for (int i = 0; i < list.size(); i++) {
					if (num.equals(list.get(i).getNum())) {
						list.get(i).plus(put);
						bool = true;
						System.out.println("입금완료");
						break;
					}
					if (bool == false) {
						System.out.println("유효하지 않은 아이디입니다.");
					}
				}
				break;
			} else if (choice == 3) {// 2번 끝
				System.out.print("계좌ID : ");
				String num = sc.nextLine();
				System.out.print("입금액 : ");
				int pot = sc.nextInt();

				boolean bool = false;
				for (int i = 0; i < list.size(); i++) {
					if (num.equals(list.get(i).getNum())) {
						list.get(i).minus(pot);
						if (list.get(i).getMoney() < pot) {
							System.out.println("잔액부족 ! ");
							break;
						}

						bool = true;
						System.out.println("출금완료");
						break;
					}
					if (bool == false) {
						System.out.println("유효하지 않은 아이디입니다.");
						break;
					}
				}
				
			} else if (choice == 4) {
				for (int i = 0; i < list.size(); i++) {
					list.get(i).count();
				}
				break;
			} else if (choice == 5) {
				break;
			}
		}

	}

}
