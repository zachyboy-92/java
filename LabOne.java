public class LabOne{
    public static void main(String name[]){
        int num1 = 10;
        int num2 = 26;
        // 1. Add, subtract, multiply, and divide (quotient & remainder) two numbers and display the output
        System.out.println(num1 + num2);
        System.out.println(num2 - num1);
        System.out.println(num1 * num2);
        System.out.println(num2 % num1);
        // 2. Swap two numbers: Store two numbers in separate variables, display their initial values, swap them, and display them again.
        num1 = num2;
        num2 = num1;
        System.out.println(num1);
        System.out.println(num2);
        // 3. Display the average of five numbers: Create five separate variables holding different numbers and find the average
        int number1 = 32;
        int number2 = 22;
        int number3 = 21;
        int number4 = 11;
        int number5 = 78;
        System.out.println((number1 + number2 + number3 + number4 + number5) / 5);
        // 4. Write a Java program that display the larger of two integers. Store these numbers in variables.
        int smallNum = 85; 
        int midNum = 36;
        int largestNum = 34;
        System.out.println(Math.max(smallNum, largestNum));
        // 5. Display the largest of three numbers.
        int largest; 
        if(smallNum > midNum){
            if(smallNum > largestNum){
                largest = smallNum;
            }else{
                largest = largestNum;
            }
        }else{
                if(midNum > largestNum){
                    largest = midNum;
                }else {
                    largest = largestNum;
                }
            }
        System.out.println(largest);
        // 6. Determine if a number is negative, positive, or zero. 
        int num = -5;
        if(num > 0){
            System.out.println("Positive Number");
        }else if(num < 0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }
        // 7. Determine if a number is even or odd. 
        if(num % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
        // 8. Store a value in a variable called age. Determine if a person with the given age is eligible to vote (18 years old)
        int age = 14;
        if(age >= 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote, come back when you're 18");
        }
   }    
}