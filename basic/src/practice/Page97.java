package practice;

public class Page97 {

	public static void main(String[] args) {
		System.out.println("7의 배수이거나 9의 배수");
		for(int i=1;i<=99;i++){
			if(i%7==0) {
				System.out.print(i + "\t");
			}else if(i%9==0) {
				System.out.print(i + "\t");
			}else if(i%7==0 && i%9==0) {
				System.out.println();
			}else {
			
			}
			if(i%42==0) {
				System.out.println();
			}
		}
		System.out.println();
		for(int i=1;i<=99;i++) {
			if(i%7==0 || i%9==0) {
				System.out.print(i + "\t");
				if(i%21==0) {
					System.out.println();
				}
			}
		}
	}

}
