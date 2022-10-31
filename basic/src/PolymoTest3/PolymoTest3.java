package PolymoTest3;

import java.util.*;

public class PolymoTest3 {
	public static Shape createShape(int type) {
		Shape sh2 = null;
		if(type == 1) {
			sh2= new Circle();
		}else if(type==2) {
			sh2 = new Triangle();
		}
		return sh2;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n 도형 선택 : 1:원 , 2.삼각형");
		
		Shape sh2 = null;
		int choice = sc.nextInt();
		Shape sh = createShape(choice);
		sh2.draw();
		sh2.delete();
		
		//요소 3개를 갖는 Circle배열 만들고 , 데이터 넣고,
		//for, 확장 for 이용 - draw()메서드 호출
		
		 Circle [] cir = new Circle[3];
         cir[0] = new Circle();
         cir[1] = new Circle();
         cir[2] = new Circle();
         
         for(int i =0;i<cir.length;i++) {
            cir[i].draw();
         }
         System.out.println();
         for(Circle c2 : cir) {
            c2.draw();
         }
         
         //
         System.out.println("\n=======배열-다형성이용=========");
         Shape [] shArr = new Shape[3];
         shArr[0] = new Triangle();
         shArr[1] = new Circle();
         shArr[2] = new Triangle();
         
         for(int i=0;i<shArr.length;i++) {
        	 shArr[i].draw();
        	 shArr[i].delete();
         }
         
         System.out.println("\n=======배열-다형성 확장 for문 이용=========");
         for(Shape n : shArr) {
        	 n.draw();
        	 n.delete();
         }
         
	}

}
