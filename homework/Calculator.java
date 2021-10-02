package javaHomework;
import java.util.Scanner;

public class Calculator {
	Scanner scan = new Scanner(System.in);
	
	static void add(int num1, int num2) {
	    System.out.println(num1 + num2);
	  }
	
	static void subtract(int num1, int num2) {
	    System.out.println(num1 - num2);
	  }
	
	static void multiply(int num1, int num2) {
	    System.out.println(num1 * num2);
	  }
	
	static void divide(int num1, int num2) {
	    System.out.println(num1 / num2);
	  }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first value");
		int numOne = scan.nextInt();
		System.out.println("Enter second value");
		int numTwo = scan.nextInt();
		System.out.println("Enter symbol");
		char symbol = scan.next().charAt(0);
		
		if((numOne >= 1 && numOne <= 5) && (numTwo >= 1 && numTwo <= 5) ) {
			switch(symbol) {
			case('+'):
				add(numOne, numTwo);
			break;
			case('-'):
				subtract(numOne, numTwo);
			break;
			case('*'):
				multiply(numOne, numTwo);
			break;
			case('/'):
				divide(numOne, numTwo);
			break;
			default:
				System.out.println("Exit");
			}
		}else {
			System.out.println("Invalid Entry, Try Again");
		}
		scan.close();

	}

}
