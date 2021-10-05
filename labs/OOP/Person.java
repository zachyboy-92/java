package lab;

public class Person {
	String pfname;
	String plname;
	int page;
	char pgender;
	String pemail;
	String puserName;
	String ppassword;
	
	
	public Person() {
		
	}
	
	
	public Person(String fname, String lname, int age, char gender, String email, String userName, String password) {
		pfname = fname;
		plname = lname;
		page = age;
		pgender = gender;
		pemail = email;
		puserName = userName;
		ppassword = password;
	}
	
	
	void display() {
		System.out.println("Name: " + this.pfname);
		System.out.println("Name: " + this.plname);
		System.out.println("Gender: " + this.pgender);
		System.out.println("Age: " + this.page);
	}
	
	void loginInfo(){
		System.out.println("Email: " + this.pemail);
		System.out.println("userName: " + this.puserName);
		System.out.println("password: " + this.ppassword);
	}
	
	static void info() {
		System.out.println("Information about person class...");
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		info();
		
		// Calling constructor
		Person p1 = new Person();
		
		p1.pfname = "John";
		p1.plname = "Smith";
		p1.page = 20;
		p1.pgender = 'M';
		p1.pemail = "john-smithgmail.com";
		p1.puserName = "Jsmith20";
		p1.ppassword = "login1";

		
		p1.display();
		p1.loginInfo();
		
		System.out.println("----------------");
		
		Person p2 = new Person();
		
		p2.pfname = "Amy";
		p2.page = 22;
		p2.pgender = 'F';  
		
		p2.display();
		
		
	}

}
