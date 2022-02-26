import java.util.*;

public class CustomExceptionTest {
	static void testVal(int val) throws TestException {
		System.out.println("Called testval");
		if ( val > 10) {
			throw new TestException(val);
		} else {
			System.out.println("valid number: " + val);
		}
	}

	public static void main(String args[]) {
		try {
			testVal(3);
			testVal(22);
		} catch (TestException t) {
			System.out.println(t);
		}
	}
}
