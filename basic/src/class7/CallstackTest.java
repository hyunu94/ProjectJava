package class7;

public class CallstackTest {

	public static void main(String[] args) {
			firstMethod();
			}
			static void firstMethod() {
			secondMethod();
			}
			static void secondMethod() {
			System.out.println("secondMethod()");
			}

	}
