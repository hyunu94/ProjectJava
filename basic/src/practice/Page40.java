package practice;
import java.util.*;
public class Page40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이용약관에 동의합니까?<Y>es/<N>o");
		String result = sc.nextLine();
		if(result.equals("Y")){
			System.out.println("동의하였습니다!");
		}else {
			System.out.println("=================");
		}

	}

}
