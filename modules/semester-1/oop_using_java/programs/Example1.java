import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // create a scanner object and pass in stdin as the source

		System.out.print("Enter Your ID: ");
		int id = Integer.valueOf(in.nextLine()); //int.nextInt doesnt consume the \n that we will enter, thus will lead to nextLine not get any input as it will take the left \n as its input, we use nextLine always or use another get nextline without assigning it to anything just to consume the \n
		System.out.println("ID: "+id);
		

		System.out.print("Enter Your Name: ");
		String name = in.nextLine();
	        System.out.println("Name: "+name);	
	}
}
