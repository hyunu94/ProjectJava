package Corona4;

class Deck{
	private static final int CARD_NUM=52;  //카드의 개수	
	private	Card[] cardList = new Card[CARD_NUM]; //카드 52장을 담는 배열
	private int count;

	Deck(){
		//(1) 카드 52장을 초기화하시오. (cardList 배열에 요소 넣기)
		for(int i=0;i<=Card.MAX_KIND;i++) {
			for(int j=0;j<=Card.MAX_NUMBER;j++) {
				Card ca = new Card(i,j);
				cardList[count++] = ca;
			}
		}

		


	}

	//(2) cardList 멤버변수에 대한 getter를 만드시오.
	public Card[] getCardList() {
		return cardList;
	}


	
	//(3) 임의의 카드 한 장을 뽑는 메서드를 만드시오.  pick()
	public Card pick() {
		int rnd = (int)Math.random()*CARD_NUM;
		Card c = cardList[rnd];
		return c;
	}


	//(4)  카드의 순서를 섞는 메서드를 완성하시오.
	public void shuffle(){
		for (int i=0;i<1000 ;i++ ){
			//카드 한 벌의 첫 번째 장과 임의로 선택한 위치에 있는 카드의 위치를 서로 바꾸는 방식
			//0번째 배열의 값과 서로 맞바꾸기
			int rnd = (int)Math.random()*CARD_NUM;
			Card c = cardList[rnd];
			
			Card temp = cardList[0];
			cardList[0] = cardList[rnd];
			cardList[rnd] = temp;
			

		}//for
	}
}//class

public class Practice {

	public static void main(String[] args) {
		

	}

}
