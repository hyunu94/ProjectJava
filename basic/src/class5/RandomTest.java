package class5;

import java.util.*;

public class RandomTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("가위<0> , 바위<1>, 보<2>, Q<quit>를 입력해주세요");
			String user = sc.nextLine();
			if(user.equalsIgnoreCase("q")) break;
			int com = (int) (Math.random()*3);
			int user1 = Integer.parseInt(user);
			
			Random rnd = new Random();
			rnd.setUser(user1);
			rnd.setCom(com);
			result =rnd.judge(user1,com);
			
			System.out.println("사용자 : " + user1);
			System.out.println("컴퓨터 : " + com);
			System.out.println("사용자 : " + result);
			
		
		
		
		}
	}
}

