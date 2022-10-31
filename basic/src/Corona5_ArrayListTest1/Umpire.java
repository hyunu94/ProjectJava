package Corona5_ArrayListTest1;

import java.util.Arrays;

public class Umpire{
	public int Strike(Pincher pit , Hitter hit) {
		String result = "";
		int num = 0;
		int sum = 0;
		int [] pinch = pit.getArr();
		int [] hitter = hit.getHit();
		
		for(int i = 0; i<3 ; i++) {
			if(pinch[i] == hitter[i]) {
				sum+=num;
			}
		}
		return sum;
	}
	
	public int Ball(Pincher pit , Hitter hit) {
		String result = "";
		int num = 0;
		int sum = 0;
		int [] pinch = pit.getArr();
		int [] hitter = hit.getHit();
		
		for(int i = 0; i<3 ; i++) {
			if(pinch[i] == hitter[1] || pinch[i] == hitter[2]) {
				sum+=num;
			}
		}
		return sum;
		
	}
}

