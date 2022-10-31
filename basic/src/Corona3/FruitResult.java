package Corona3;

public class FruitResult {
	private int num; // 사과개수
	private int change; // 거스름돈
	
	public FruitResult(int num,int change) {
		this.num = num;
		this.change = change;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num=num;
	}
	
	public int getChange() {
		return change;
	}
	
	public void setChange(int change) {
		this.change=change;
	}
}
