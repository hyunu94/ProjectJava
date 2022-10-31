package practice;

public class Page98 {
	public static void main(String[] args) {
		int i = 0 , j = 0;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println(); // 1 54321 2 5432 3 543
		for(i=1;i<=5;i++) {
			for(j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("1부터 10까지의 합");
		for(i=1;i<=10;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
				if(i>j) {
					System.out.print("+");
				}
			
			}
			System.out.println();
		}	
	}

}
