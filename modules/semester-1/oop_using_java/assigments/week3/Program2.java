import java.util.Scanner;

public class Program2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = Integer.valueOf(in.nextLine());
		int temp = 1;

		System.out.print("Even numbers between 1 and "+num+" : ");
		while ( temp <= num ) {
			if (temp % 2 == 0) {
				System.out.print(temp);
				
				if (temp + 1 != num && temp != num) { // this condition is just to format the ',' in output.
					System.out.print(", ");
				}
			}
			temp = temp + 1;
		}
		System.out.print("\n");
	}
}

/*
 * OUTPUT:
 * 
Enter a number: 10
Even numbers between 1 and 10 : 2, 4, 6, 8, 10

Enter a number: 15
Even numbers between 1 and 15 : 2, 4, 6, 8, 10, 12, 14
 */
