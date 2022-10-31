import java.util.Arrays;
import java.util.Scanner;

public class LottoTest2 {
	public static int[] lotto() {
		int[] arr = new int[6];
				
		//1~45 임의의 정수 배열에 넣기 - 6번 반복
		//중복되지 않도록 처리 !
		for(int i=0;i<arr.length;i++) {
			int rnd=(int)(Math.random()*45+1);
			arr[i]=rnd;
					
			//중복 제거
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {  //rnd == arr[k]
					i--;
					break;
						}
					}//안쪽 for				
				}//for
				
				return arr;
			}
			
			public static void main(String[] args) {
				//1. 배열 만들기 - 요소 6개
				//int[] arr = new int[6];
				Scanner sc = new Scanner(System.in);
				
				while(true) {	
					//2. 1~45 임의의 정수 배열에 넣기 - 6번 반복
					//중복되지 않도록 처리 !
					int[] arr=lotto();
					
					//3. 정렬
					Arrays.sort(arr);
					
					//4. 출력
					for(int n : arr) {
						System.out.print(n+"\t");
					}//for
					
					System.out.println("\n\n그만하려면 Q");
					String quit = sc.nextLine();
					if(quit.equalsIgnoreCase("Q")) break;
				}//while
				
			}

		}

}

}
