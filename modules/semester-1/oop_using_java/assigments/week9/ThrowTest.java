import java.util.*;

public class ThrowTest {
	static void test() {
		try {
			throw new NullPointerException ("Testing");
		} catch (NullPointerException e) {
			System.out.println("Just a print from catch");
			throw e;	
		}
	}

	public static void main(String args[]) {
		try {
			test();
		} catch (NullPointerException e) {
			System.out.println("caught in main" + e);
		}
	}

}
