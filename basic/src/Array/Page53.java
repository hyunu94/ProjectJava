package Array;

public class Page53 {

	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
			// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			if(ch>='0' && ch<='9') {
				result = Character.toString(numCode[i-2]);
			}else {
			result = Character.toString(abcCode[i]);
			}
			
			System.out.println("src : " +src+ "\nresult : " + result);
			
			}
			
			
	}

}
