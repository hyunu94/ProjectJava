package class5;

class Score{
	private int kor;
	private int eng;
	private int math;
	
	public Score(int kor,int eng,int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int total() {
		int total = (kor + eng + math);
		return total;
	}
	public int aveg() {
		int aveg = total()/3;
		return aveg;
	}
}

public class Page55 {

	public static void main(String[] args) {
		

	}

}
