import java.util.*;

public class TestException extends Exception {
	private int val;

	public TestException (int val) {
		this.val = val;
	}

	public String toString() {
		return "Test Exception ["+this.val+"]";
	}
} 
