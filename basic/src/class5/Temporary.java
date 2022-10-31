package class5;

class Temporary{
	private String name;
	private int time;
	private int pay;
	
	public Temporary(String name,int time,int pay) {
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public int getPay() {
		return pay;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int total() {
		int total = (pay*time);
		return total;
	}
	
}

