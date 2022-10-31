package practice;

public class Page109 {

	public static void main(String[] args) {
		//1. butterfly
		//star decrease
		for (int i=0;i<5 ;i++ ){ //0 1 2 3 4 
			for (int j=0;j<i ;j++ ){ // 0 0 0,1 0,1,2, 0,1,2,3
				System.out.print(" ");
				}
			for (int k=1;k<2*(5-i) ;k++ ) // 1 2 3 
				{
				System.out.print("*");
			}
			System.out.println();
		}//for

		
		
		
		
	}

}
