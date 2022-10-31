package class5;

class Random {
	private String result ;
	private int user;
	private int com;
	private String [] arr = {"가위" , "바위" , "보"};
	
	
	public String getResult(){
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public int getUser(){
		return user;
	}
	
	public void setUser(int User) {
		this.user = user;
	}
	
	public int getCom(){
		return com;
	}
	
	public void setCom(int com) {
		this.com = com;
	}
	
	public String judge(int user,int com) {
		if((user-com+3)%3==1) {
			result = "사용자가 이겼습니다";
		}else if((user-com+3)%3==2) {
			result = "사용자가 졌습니다";
		}else if((user-com+3)%3==0){
			result = "사용자가 비겼습니다";
		}else {
			result = "잘못 입력했습니다";
		}
		return result;
	}
	
	public String change(int i) {
			return arr[i];
	
	}
	
	
	
}
