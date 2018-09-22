package LAB1;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num1 = 0, num2 = 0, ones, tens, huns, ones1, tens1, huns1, ones2, tens2, huns2;
	boolean numbercheck;
	
	//Enter first number while checking if a number is inputed.
	do {
		System.out.println("Enter a three digit number: ");
		if (input.hasNextInt()) {
			num1 = input.nextInt();
			numbercheck = true;
		} else {
			System.out.println("Not a number!");
			numbercheck = false;
			input.next();
		}
	} while (!(numbercheck));
	
	//Enter second number while checking if a number is inputed.
	do {
		System.out.println("Enter a three digit number: ");
		if (input.hasNextInt()) {
			num2 = input.nextInt();
			numbercheck = true;
		} else {
			System.out.println("Not a number!");
			numbercheck = false;
			input.next();
		}
	} while (!(numbercheck));
	input.close();
	
	//Place values for the first number
	ones1 = num1 % 10;
	tens1 = (num1 %100) / 10;
    huns1 = (num1 /100);
    
    //Place values for the second number
    ones2 = num2 % 10;;
    tens2 = (num2 %100) / 10;
    huns2 = num2 /100;
    
	//Combine each place value
    ones = (ones1 + ones2);
    tens = (tens1 + tens2);
    huns = (huns1 + huns2);
    
    //Check if numbers are equal to each other
	if ((ones==tens) && (ones==huns)) {
		System.out.println("True");
	} else {
		System.out.println("False");
	}
	}
}

/* Sources:
 * Grand Circus Java Unit 1
 * https://www.youtube.com/watch?v=PWez5mVXACc
 * https://stackoverflow.com/questions/46154077/extract-ones-and-tens-from-an-integer-value
 */