package Corona3;

//카드 한벌 - 52장의 카드를 갖는 클래스
//포함관계 이용
public class Deck {
	private static final int CARD_NUM = 52; //카드의 개수
	private Card[] cardList = new Card[CARD_NUM]; // 카드 52장을 담는 배열
	private int index;
	
	public Deck() {
		//카드 52장 초기화 : 4*13 => 52
		for(int i=1 ; i<=Card.MAX_KIND;i++) { //4
			for(int j=1 ; i<=Card.MAX_NUMBER;i++) {//13
				Card c = new Card(i,j); // 카드 무늬, 숫자 
				cardList[index++] = c;
			}
		}
	}
	
	public Card[] getCardList() {
		return cardList;
	}
	
	//지정된 위치에 있는 카드 하나 뽑기
	public Card pick(int idx) {
		Card c = null;
		if(idx<0 || idx>=CARD_NUM) { //!(idx>= && idx<=52)
			c=pick();
		}else {
			c=cardList[idx];
		}
		
		return c;
	}
	
	//임의의 카드 한장 뽑기
	public Card pick() {
		//0~51사이의 idx에 해당하는 랜덤값 뽑기
		int rnd = (int)(Math.random()*52); //0~51
		Card c = cardList[rnd];
		return c;
	}
	
	//카드의 순서를 섞는다
	public void shuffle() {
		for(int i=0;i<1000;i++) {
			//임의의 index값 읽어오기
			int rnd = (int)(Math.random()*52); //0~51
			
			//0번째 배열의 값과 임의번째 배열의 값을 서로 맞바꾸기
			Card temp = cardList[0];
			cardList[0] = cardList[rnd];
			cardList [rnd] = temp;
		}//for
	}
}
