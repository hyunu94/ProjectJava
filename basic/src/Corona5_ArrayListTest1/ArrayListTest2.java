package Corona5_ArrayListTest1;

import java.util.ArrayList;

/*제네릭스(Generics)
  - 컬렉션에 저장할 객체의 타입을 지정
  - 지정한 타입의 객체만 해당 컬렉션에 저장 가능
  - 꺼낼때는 자동 형변환해줌
  
  컬렉션클래스<저장할 객체의 타입> 변수명 = new 컬렉션클래스(저장할 객체의 타입>();
*/

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//데이터 저장
		list.add(1);
		list.add(22);
		list.add(3);
		
		//데이터 읽어오기
		for(int i=0;i<list.size();i++){
			int n = list.get(i);
			//=> 형변환 필요없다, unboxing:저장된 값을 꺼낼 때도 기본형 형태의 값을 바로 얻는 것

			System.out.println(n);
		}
		
		//데이터 삭제
		list.remove(0);
		
		System.out.println("\n======삭제 후=========");
		for(int i=0;i<list.size();i++) {
			int n2 = list.get(i);
			System.out.println(n2);
		}
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			list2.add(i+1);
		}
		
		for(int i=0;i<list2.size();i++) {
			int n = list2.get(i);
			System.out.println(n);
		}
		
	}

}
