package Corona2;

class Person{
	public String kind(){
		return "사람";
	}
};
class Student extends Person{
	public String kind(){
		return "학생";
	}
};
class Graduate extends Student{
	public String kind(){
		return "대학원생";
	}
};
class Assistant extends Person{
	public String kind(){
		return "조교";
	}
};
class Professor extends Person{
	public String kind(){
		return "교수";
	}
}//

class PolyArgs{
	/*
	public static void register(Student s)
	{
		System.out.println(s.kind() + " 이/가 등록합니다.");
	}
	public static void register(Graduate g)
	{
		System.out.println(g.kind() + " 이/가 등록합니다.");
	}
	public static void register(Assistant a)
	{
		System.out.println(a.kind() + " 이/가 등록합니다.");
	}
	*/
	

	//(1) 위 주석 부분의 코드를 메서드 하나로 처리하시오.
	public static void register(Person per) {
	if(per instanceof Student || per instanceof Graduate || per instanceof Assistant) {
		System.out.println(per.kind() + " 이/가 등록합니다");
		}
	}

	public static void main(String[] args){
		//(2) 작성한 register 메서드를 4번 호출하시오. Person의 자식 클래스 4개를 모두 이용할 것
		

	}
}//

