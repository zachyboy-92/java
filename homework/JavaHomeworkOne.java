package javaHomework;

public class JavaHomeworkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1
		
		int grade = (int)(Math.random() * 101);
		System.out.println(grade);
		if(grade >= 90) {
			System.out.println("A");
		}else if(grade >= 80) {
			System.out.println("B");
		}else if(grade >= 70) {
			System.out.println("C");
		}else if(grade >= 55) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		//Question 2
		
		int day = (int)(Math.random() * 7) + 1;
		System.out.println(day);
		switch(day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Number not available");
		}
		
		//Question 3
		
		int randomNumber = (int)(Math.random() * 30);
		System.out.println(randomNumber);
		if(randomNumber % 2 == 0) {
			if(randomNumber >= 2 && randomNumber <= 5) {
				System.out.println("Not Cool");
			}else if(randomNumber >= 6 && randomNumber <= 20) {
				System.out.println("Cool");
			}else {
				System.out.println("Not Cool");
			}
		}else {
			System.out.println("Cool");
		}
		
	}

}
