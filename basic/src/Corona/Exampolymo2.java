package Corona;

class Animal2{
	public static Animal ani(int type) {
		Animal ar = null;
		if(type == 1) {
			ar = new Cow();
		}else if(type == 2) {
			ar = new Cat();
		}
		return ar;
	
	}
}
public class Exampolymo2 {
	public static void main(String[] args) {
		//1.Animal 자식 객체를 리턴하는 메서드 만들고 호출후
		//bark() 메서드 호출
		Animal ar = null;
		int n = 1;
		
		
		
		
		
		//2.Animal배열 만들고 , 데이터 넣고
		//for, 확장for 이용해서 bark()메서드 호출
		Animal []ani2 = new Animal[2];
		ani2[0] = new Animal();
		ani2[1] = new Animal();
		
		for(int i = 0;i<ani2.length;i++) {
			ani2[i].bark();
		}
		
	}

}
