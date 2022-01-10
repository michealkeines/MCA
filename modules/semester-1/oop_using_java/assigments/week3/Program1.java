import java.util.Scanner;

public class Program1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your Age: ");
		int age = Integer.valueOf(in.nextLine());

		if ( age >= 18 ) {
			System.out.println("You're Eligible to vote.");
		} else {
			System.out.println("You're not Eligible to vote.");
		}

	}

}
