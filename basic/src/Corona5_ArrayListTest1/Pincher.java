package Corona5_ArrayListTest1;

public class Pincher {
	private int [] arr = new int[3];
	
	public int[] getArr() {
		return arr;
	}
	
	public int[] save() {
		for(int i=0;i<arr.length;i++) {
		int rnd = (int)Math.random()*9+1;
		arr[i]=rnd;
		
		for(int j=0;j<i;j++) {
			if(arr[i] == arr[j]) {
				i--;
				break;
				}
			}
		}
		
		return arr;
	}
	
	
}
