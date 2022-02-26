import java.util.*;

public class ThrowsTest {
	public static void throwTestOne () throws NullPointerException {
		System.out.println("Inside test one");
		throw new NullPointerException ("This is called direclty inside the method without try and catch");
	}

	public static void main (String args[]) {
		try {
			throwTestOne();
		} catch (NullPointerException e) {
			System.out.println("caught in main: " + e);
		}
	}
}
