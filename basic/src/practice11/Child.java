package practice11;

class Child {
	private int numOfBead;
	
	Child(int numOfBead){
		this.numOfBead = numOfBead;
	}
	
	public int loseBead(int loseCount) { //잃는 메서드
		 return numOfBead-=loseCount;
		 
	}
	
	public void obtainBead(Child child, int obtainCount) { // 상대에게 구슬 획득 메서드
		child.numOfBead+=obtainCount;
		
	}
	
	public void showProperty() {
		System.out.println("보유 구슬의 개수 : " + numOfBead);
	}
}
