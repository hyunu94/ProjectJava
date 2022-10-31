package practice2;

public class Page50 {
	
	public static int fibo(int a) {
		 if(a==0) {
			 return 0;
		 }if(a==1) {
			 return 1;
		 }else {
			return fibo(a-2) + fibo(a-1);
		}
	}	

	public static void main(String[] args) {
		for(int i=0 ; i<10 ; i++) {
			int num = fibo(i);
			System.out.println(num);
			if(i!=9) {
				System.out.print(",");
			}
		}
		

	}

}
