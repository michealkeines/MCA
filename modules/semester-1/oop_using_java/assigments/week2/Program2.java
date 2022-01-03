import java.util.Scanner;

class Program2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter The Total Number of Units Consumed: ");
		int units = Integer.valueOf(in.nextLine());

		System.out.print("Total Units Consumed: "+ units + "\n\n");

		if (units <= 50) {
			System.out.println("You will be Charged 0.50/unit.");
			System.out.println("Total Electricity Bill for " + units + " units : "+ (units * 0.50));
		} else if (units > 50 && units <= 150 ) {
			System.out.println("You will be Charged 0.75/unit.");
			System.out.println("Total Electricity Bill for " + units + " units : "+ (units * 0.75));
		} else if (units > 150 && units <= 250) {
			System.out.println("You will be Charged 1.20/unit.");
			System.out.println("Total Electricity Bill for " + units + " units : "+ (units * 1.20));
		} else {
			System.out.println("You will be Charged 1.50/unit.");
			System.out.println("Total Electricity Bill for " + units + " units : "+ (units * 1.50));
		}

	}
}
