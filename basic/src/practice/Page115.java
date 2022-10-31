package practice;

public class Page115 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(;i<=20;i++) {
			if(i%2!=0 && i%3!=0){
				sum+=i;
			}

		}
		System.out.println(sum + "\n");
		
		for(int j=1;j<=10;j++) { // 1 (1)+2 (1+2)+3 (1+2+3)+4   i i+2 i+(i+2)+3
			sum2+=j;
			sum3+=sum2;
		}
		System.out.println("totalSum = " +sum3);
	}

}
