import java.util.Scanner;

class Program2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter The Total Number of Units Consumed: ");
		int units = Integer.valueOf(in.nextLine());

		System.out.print("Total Units Consumed: "+ units + "\n\n");

		/// First 50 units will be charged at 0.50/units
		/// Next 100 units will be charges at 0.75/units
		/// Next 100 units will be charge at 1.20/units
		/// Units above 250, will be directly charged at 1.50/units

		if (units <= 250) {
			int temp = units;
			int tries = 0;
			float current_total = 0;

			while (temp > 0 && tries < 3) {
				if ( tries == 0 ) {
					System.out.println("You will be Charged 0.50/unit for first 50 Units.");
					
					int t = temp - 50;

					if (t < 0) {
						current_total += (temp * 0.50);
						tries += 1;
						temp = temp - 50;
					} else {
						current_total += (50 * 0.50);
						tries += 1;
						temp = temp - 50;
					}
				} else if ( tries == 1 ) {
					System.out.println("You will be Charged 0.75/unit for next 100 Units.");
					int t = temp - 100;
					if (t < 0) {
						current_total += (temp * 0.75);
						tries += 1;
						temp = temp - 100;
					} else {
						current_total += (100 * 0.75);
						tries += 1;
						temp = temp - 100;
					}
				} else if ( tries == 2 ) {
					System.out.println("You will be Charged 1.20/unit for next 100 Units");
					int t = temp - 100;

					if (t < 0) {
						current_total += (temp * 1.20);
						tries += 1;
						temp = temp - 100;
					} else {
						current_total += (100 * 1.20);
						tries += 1;
						temp = temp - 100;
					}
				}
			}
			System.out.println("Total Electricity Bill for " + units + " units : "+ current_total);
		} else {
			System.out.println("You will be Charged 1.50/unit.");
			System.out.println("Total Electricity Bill for " + units + " units : "+ (units * 1.50));
		}

	}
}
