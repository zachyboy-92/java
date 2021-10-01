package javaHomework;
import java.util.Scanner;

public class InputHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		
		//Question 1		
		int num1 = 0;
		int num2 = 1;
		System.out.println("Input First value and Second value");
		int startingNumber = scan.nextInt();
		int endingNumber = scan.nextInt();
		for(int j = startingNumber; j <= endingNumber; j++) {
			System.out.print(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
            num2 = num3;
		}
		
		//Question 2
		System.out.println("Input number");
		int number = scan.nextInt();
		double sum = 0;
		String temp = Integer.toString(number);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    numbers[i] = temp.charAt(i) - '0';
		    sum += Math.pow(numbers[i], numbers.length);
		}
		if(sum == number) {
			System.out.println(Math.round(sum) + " is a Armstrong Number");
		}else {
			System.out.println(Math.round(sum) + " is not a Armstrong Number");
		}
		
		//Question 3
		System.out.println("Input word");
		String word = scan.next();
		String result = new StringBuffer(word).reverse().toString();
		if(result.equals(word)){
			System.out.println(word + " is palindrome");
		}else {
			System.out.println(word + " is not palindrome");
		}

	}

}
