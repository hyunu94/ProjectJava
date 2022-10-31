package PolymoTest3;

import java.util.Scanner;

class Shape {
   public void draw() {
      System.out.println("도형 그리는 메서드");
   }

   public void delete() {
      System.out.println("도형 지우는 메서드");
   }

   public void showInfo() {
      System.out.println("부모-Shape");
   }
}

class Circle extends Shape {
   public void draw() {
      System.out.println("원을 그린다");
   }

   public void delete() {
      System.out.println("원을 지운다");
   }

   public void sayCircle() {
      System.out.println("원의 메서드!");
   }

}

class Triangle extends Shape {
   public void draw() {
      System.out.println("삼각형을 그린다");
   }

   public void delete() {
      System.out.println("삼각형을 지운다");
   }

   public void sayTriangle() {
      System.out.println("삼각형의 메서드!");
   }
}

public class PolymoTest3{

   public static void main(String[] args) {

      Circle c = new Circle();
      c.draw();
      c.delete();
      c.sayCircle();
      c.showInfo();

      System.out.println("\n======다형성========");
      Shape sh = new Circle();
      sh.draw(); // 자식의 오버라이딩 메서드
      sh.delete();
      sh.showInfo(); // 부모 메서드
      // sh.sayCircle(); //error : 자식만의 메서드 사용불가

      sh = new Triangle(); // 부모의 참조변수로 자식의 메서드 접근
      sh.draw();
      sh.delete();
      
      //사용자로부터 원, 삼각형 중 입력 받아서 해당 객체 생성하기
      Scanner sc = new Scanner(System.in);
      System.out.println("도형 선택!(1.원, 2.삼각형)");
      int type=sc.nextInt();
      
      if(type==1) {
         Circle c2=new Circle();
         c2.draw();
         c2.delete();
      }else if(type==2) {
         Triangle tr =new Triangle();
         tr.draw();
         tr.delete();
      }else {
         System.out.println("잘못 입력함!!!");
      }
      
      System.out.println("\n------다형성 이용-------");
      
      Shape sh2=null;  
      if(type==1) {
         sh2=new Circle();
      }else if(type==2) {
         sh2=new Triangle();
      }else {
         System.out.println("잘못 입력!");
         return;
      }
      
      sh2.draw();
      sh2.delete();


   }

}

