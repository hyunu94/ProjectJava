package practice;

public class Page82 {
	public static void main(String[] args) {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (ch == 'z') {
				System.out.print("");
			}
			System.out.print(ch + " ,");
		}
		
		int i = 0, j = 0;
		for (i = 1 ; i<=9;i++) {
			for (j = 2; j <=9; j++) {
			
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println("");
		}
	}

}
