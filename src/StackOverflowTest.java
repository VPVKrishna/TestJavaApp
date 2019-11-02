public class StackOverflowTest {
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		try{
			method1();
		}catch(StackOverflowError e){			
			e.printStackTrace();
		}
		
	}
}
