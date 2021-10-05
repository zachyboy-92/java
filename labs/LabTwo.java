package lab;
import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1
		//Write a for loop that runs 10 times and print the value of the controlling variable all on the same line
		for(int i = 0; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		//Question 2
		//Write a for loop that iterates between 1 and 10, but counts by 2. Inside the loop, print your name on different lines
		for(int i = 0; i <= 10; i+=2) {
			System.out.println("Zack");
		}
		//Question 3
		//Write a for loop to print asterisk (*) 15 times on the same line
		for(int i = 1; i <= 15; i++) {
			System.out.print('*');
		}
		System.out.println();
		//Question 4
		//Write a for loop for the given output
		//1, 3, 5, 7, 9	
		for(int i = 1; i <= 9; i+=2) {
			System.out.println(i);
		}
		//2, 4, 6, 8, 10
		for(int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		//Question 5
		//Use a while loop to add up the numbers 1 to 20 into one variable. Print out the sum at the end
		int i = 0;
		int count = 0;
		while(i <= 20) {
			count += i;
			i++;
			System.out.println(count);
		}
		System.out.println(count);
		System.out.println();
		//Question 6
		//Use a while loop to print out the even number from 1 to 20
		int index = 1; 
		while(index <= 20) {
			if(index % 2 == 0) {
				System.out.println(index + " Even");
			}else {
				System.out.println(index + " Odd");
			}
			index++;
		}
		System.out.println();
		//Question 7
		//Write a for loop to display the following outputs:	
		/*
		 * 1                  11111
 		   22                 2222
 		   333                333
           4444               44
           55555              5
		 */
		for(int z = 1; z <= 5; z++) {
			for(int j = 1; j <= z; j++) {
				System.out.print(z);
			}
			System.out.println();
		}
		System.out.println();
		for(int z = 1; z <= 5; z++) {
			for(int j = 5; j >= z; j--) {
				System.out.print(z);
			}
			System.out.println();
		}
		
		System.out.println();
		//Question 8
		//Write a for loop that iterates from 1 - 20. Should print “prime” for all prime numbers.
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
        
		System.out.print("Enter a number:");
		int num = scan.nextInt();
		 
        boolean flag = false;
        for(int j = 2; j <= num/2; ++j)
        {
            if(num % j == 0){
               flag = true;
              break;
            }
       }
       if (!flag)
         System.out.println(num + " is a prime number.");
       else
    	   System.out.println(num + " is not a prime number.");      

		
		//New lab
        //Question 1
       System.out.println("Input starting and ending loop values");
        int startingValue = scan.nextInt();
        int endingValue = scan.nextInt();
        for(int j = startingValue; j <= endingValue; j++) {
        	System.out.println(j);
        }
        
        //Question 2
        System.out.println("Input Value");
        int value = scan.nextInt();
        for(int k = 1; k <= value; k++) {
        	for(int l = 1; l <= 3; l++) {
        		System.out.print(k * 2);
        	}
        	System.out.println();
        }
	}

}
