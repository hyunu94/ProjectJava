package practice;

public class Page121_7 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		for (i = 1; i < 26; i++) {
			for (j = 1; j < 5; j += 5) {
				System.out.print(i + "\t");
				if (i % 5 == 0) {
					System.out.println();
				}
			}

		}

	}

}