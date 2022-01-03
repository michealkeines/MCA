
import java.util.Scanner;

class Program1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two numbers");
		
		System.out.print("Number one: ");
		int num1 = Integer.valueOf(in.nextLine());

		System.out.print("Number two: ");
		int num2 = Integer.valueOf(in.nextLine());

		System.out.println("\nYour Input Numbers are "+ num1 +" and "+ num2+"\n");

		System.out.println("Sum of two numbers: " + num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println("Difference between two numbers: " + num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println("Product of two numbers: " + num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println("Quotient of two numbers: " + num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println("Reminder of two numbers: " + num1 + " % " + num2 + " = " + (num1%num2));


	}
}
