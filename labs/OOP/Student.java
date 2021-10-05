package lab;

public class Student {
	int sId;
	String sFName;
	String sLName;
	String sEmail;
	double sSubjectOne;
	double sSubjectTwo;
	double sSubjectThree;
	
	
	public Student() {
		
	}
	
	public Student(int id, String fname, String lname, String email, double subjectOne, double subjectTwo, double subjectThree) {
		sId = id;
		sFName = fname;
		sLName = lname;
		sEmail = email;
		sSubjectOne = subjectOne;
		sSubjectTwo = subjectTwo;
		sSubjectThree = subjectThree;
	}
	
	void printStudent() {
		System.out.println("student");
		System.out.println("first name " + this.sId);
		System.out.println("first name " + this.sFName);
		System.out.println("first name " + this.sEmail);
		System.out.println("first name " + this.sSubjectOne);
		System.out.println("first name " + this.sSubjectTwo);
		System.out.println("first name " + this.sSubjectThree);
	}
	
	void studentAverage() {
		double average = (this.sSubjectOne + this.sSubjectTwo + this.sSubjectThree) / 3;
		System.out.println(average);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(12 ,"Zakaria", "Merfouk", "zmerfouk@gmail.com", 91.2, 92.4, 81.5);
		
		s1.printStudent();
		s1.studentAverage();
	}

}


