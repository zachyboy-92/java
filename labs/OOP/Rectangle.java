package lab;

public class Rectangle {
	int rWidth;
	int rLength;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int length, int width) {
		rWidth = width;
		rLength = length;	
	}
	
	public void area() {
		System.out.println(rWidth * rLength);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(6, 8);
		r1.area();
		
		Rectangle r2 = new Rectangle(9, 11);
		r2.area();
	}

}
