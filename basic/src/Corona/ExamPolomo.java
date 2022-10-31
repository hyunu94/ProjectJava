package Corona;

import java.util.*;

class Animal{
	   public void bark(){
	      System.out.println("울다");
	   }
	   
	   public void parent(){
	      System.out.println("난 부모-동물");
	   }
	}

	class Cat extends Animal{
	   public void bark()   {
	      System.out.println("야옹야옹");
	   }
	   
	   public void child()   {
	      System.out.println("난 자식-고양이");
	   }
	}

	class Cow extends Animal{
	   public void bark(){
	      System.out.println("음메음메");
	   }
	}

	class Dog extends Animal{
	   public void bark(){
	      System.out.println("멍멍");
	   }
	}

	public class ExamPolomo {

	   public static void main(String[] args) {
	      //1. 다형성 이용 - Cat, Cow bark() 메서드 호출
	      Animal am = new Cat();
	      am.bark();
	      
	      am = new Cow();
	      am.bark();
	      
	      //2. 사용자 입력받아서 해당 객체 생성 후 bark() 메서드 호출
	      System.out.println("=========사용자 입력 기존방식=======");
	      Scanner sc =new Scanner(System.in);
	      //1.고양이, 2.소, 3.개 입력!
	      //[1] 기존방식
	      System.out.println("1.고양이, 2.소, 3.개 입력");
	      int n = sc.nextInt();
	      
	      if(n==1) {
	         Cat ct = new Cat();
	         ct.bark();
	      }else if(n==2) {
	         Cow cw = new Cow();
	         cw.bark();
	      }else if(n==3) {
	         Dog dg = new Dog();
	         dg.bark();
	      }else {
	         System.out.println("잘못 입력");
	      }
	      
	      //[2] 다형성 이용
	      System.out.println("=========사용자 입력 다형성 이용=======");
	      System.out.println("1.고양이, 2.소, 3.개 입력");
	      n = sc.nextInt();
	      
	      Animal am2=null;
	      if(n==1) {
	         am2 = new Cat();
	      }else if(n==2) {
	         am2 = new Cow();
	      }else if(n==3) {
	         am2 = new Dog();
	      }else {
	         System.out.println("잘못 입력");
	         return;
	      }
	      
	      am2.bark();
	   }
		
	}

