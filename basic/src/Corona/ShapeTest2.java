package Corona;

import java.util.Scanner;

public class ShapeTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int MAX_COUNT=100;
		Shape [] sh = new Shape[MAX_COUNT];
		int index=0;
		
		while(true) {
			System.out.println("1.원 2.사각형 3.보기 4.종료");
			int type = sc.nextInt();
			
			if(type ==1|| type ==2) {
				if(index>=MAX_COUNT) {
					System.out.println("데이터를 더 이상 입력할 수 없습니다");
					continue;
				}
			}
			
			switch(type) {
					case 1:
						System.out.println("반지름 입력!");
						int r = sc.nextInt();
						sh[index++] = new Circle(r);
						break;
					case 2:
						System.out.println("사각형의 가로,세로 입력!");
						int w = sc.nextInt();
						int h = sc.nextInt();
						sh[index++] = new Square(w,h);
						break;
					case 3:
						System.out.println("\n========모든 도형의 면적===========");
						if(index<1) {
							System.out.println("데이터가 없습니다");
							continue;
						}
						for(int i=0;i<index;i++) {
							double area = sh[i].findArea();
							System.out.println(sh[i].kind() +"의 면적 : " + area);
						}
						break;
					case 4:
						System.out.println("\n프로그램 종료함!");
						System.exit(0);
					default :
						System.out.println("\n잘못 입력");
						continue;
				
			}//switch
		
		}//while

	}

}
