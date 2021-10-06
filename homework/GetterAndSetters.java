package javaHomework;

import lab.Computer;

public class GetterAndSetters {
	private static String name= "MacBook";
	private static int year = 2021;
	private static int price = 1199;
	
	public String getComputer() {
		return "Computer name " + name + " year " + year + " and price " + price; 
	}
	
	
	public void setName(String newBrand, int newYear, int newPrice) {
		name = newBrand;
		year = newYear;
		price = newPrice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer();
		System.out.println(c1.getComputer());
		
		
		c1.setName("Dell", 2019, 999);
		System.out.println(c1.getComputer());
		
		c1.setName("HP", 2020, 799);
		System.out.println(c1.getComputer());
	}

}
