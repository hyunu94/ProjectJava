package Array;

public class Page51 {

	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int money = 3870;
		int coinUnit2 = 0;
		System.out.println("money="+money+"\n");
		for(int i=0;i<coinUnit.length;i++) {
			coinUnit2 = money/coinUnit[i];
			money=money%coinUnit[i];
			System.out.println(coinUnit[i] + ": " + coinUnit2);
		}

	}

}
