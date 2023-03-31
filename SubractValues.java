import java.util.*;

public class SubractValues {
	
	public static void main(String[] args) {
				
		Scanner in = new Scanner(System.in);
		
		//variables
		int x = 0;
		int y = 0;
		int z = 0;
		
		//asking user if they want to subtract
		System.out.println("Would you like to subtract values?"
					 +	 "\n1. Yes"
				     +   "\n2. No");
		
		int userChoice = in.nextInt();
		
		/*if user wants to subtract values, the program prompts the user to input two values x, y and then 
		displays the difference (z). they are then prompted to multiple, divide, add or subtract z with another
		value that they also need to input */
		if (userChoice == 1) {
		System.out.print("Enter a value: ");
		x = in.nextInt();
		
		System.out.print("Enter another value: ");
		y = in.nextInt();
		
		z = x - y;
		
		System.out.print("The difference is: " + z);
		
		System.out.println("\nWhat would you like to do to the difference?"
				 +	 "\n1. Subtraction"
				 +	 "\n2. Addition"
				 +	 "\n3. Division"
			     +   "\n4. Multiplication");
		int userCalculation = in.nextInt();
	
		System.out.print("\nEnter a value to change the difference: ");
		int a = in.nextInt();
		
		if (userCalculation == 1) {
			System.out.println("The difference is: " + (z - a));
		}
		
		if (userCalculation == 2) {
			System.out.println("The sum is: " + (z + a));
		}
		
		if (userCalculation == 3) {
			System.out.println("The quotient is: " + (z / a));
		}
		
		if (userCalculation == 4) {
			System.out.println("The product is: " + (z * a));
		}
		
		System.out.println("Have a nice day :)");
		} 
		
		//if the user does not wish to use the program
		if (userChoice != 1) {
			System.out.print("Have a nice day <3");
		}
		
	}
}
	
