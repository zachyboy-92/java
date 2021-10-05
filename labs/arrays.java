package lab;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		//Question 1
		
		// TODO Auto-generated method stub
		int numbers[] = { 3,6,3,6,2,4,10 };
		int average = 0;
		for(int i = 0; i < numbers.length; i++) {
			average += numbers[i];
		}
		System.out.println(average);
		
		//Question 2
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String inputedWord = scan.next();
		String words[] = {"hello", "apple", "banana", "hello", "hello"};
		int sum = 0;
		for(int j = 0; j < words.length; j++) {
			if(words[j].equals(inputedWord)) {
				++sum;
			}
		}
		System.out.println(sum);
		//Question 3
		String arrayOne[] = {"apple", "banana", "grape"};
		String arrayTwo[] = {};
		for(int k = 0; k < arrayOne.length; k++) {
			arrayTwo = arrayOne;
		}
		System.out.println(Arrays.toString(arrayTwo));
		System.out.println(Arrays.toString(arrayOne));
	}

}
