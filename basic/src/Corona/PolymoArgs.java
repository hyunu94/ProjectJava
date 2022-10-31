package Corona;

class Person{
	public String kind() {
		return "사람";
	}
}

class Student extends Person{
	public String kind() {
		return "학생";
	}
}

class Graduate extends Person{
	public String kind() {
		return "대학원생";
	}
}

class Assistant extends Person{
	public String kind() {
		return "조교";
	}
}

class Professor extends Person{
	public String kind() {
		return "교수";
	}
}
public class PolymoArgs {
	/*
	public static void register(Student st) {
		System.out.println( st.kind() + "이/가 등록합니다"); // 학생
	}
	
	public static void register(Graduate gr) {
		System.out.println( gr.kind() + "이/가 등록합니다"); // 
	}
	
	public static void register(Assistant a) {
		System.out.println( a.kind() + "이/가 등록합니다"); // 
	}
	*/
	
	public static void register(Person st) {
		//if(st instanceof Student  || st instanceof Graduate  || st instanceof Assistant) {
		if(st instanceof Student  || st instanceof Graduate  || st instanceof Assistant) {
			System.out.println(st.kind()+ "이/가 등록합니다.");
		}else {	//학생,대학원생,조교
			System.out.println(st.kind()+ "은/는 등록할 수 없습니다");
		}
	}
	
	public static void main(String[] args) {
		register(new Student());
		register(new Graduate());
		
		
		
		register(new Professor());
		
		
		
		
		
		
		}
	
	
	

}
