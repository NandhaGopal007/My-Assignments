package week1.day2;

public class Calculator {
	
	public void addTwoNumbers(int a,int b) {
		
		int c=a+b;
		System.out.println(c);
	}
	
public void subTwoNumbers(int a,int b) {
		
		int c=a-b;
		System.out.println(c);
	}
	
public void multipleTwoNumbers(int a,int b) {
	
	int c=a*b;
	System.out.println(c);
}

public void divisionTwoNumbers(int a,int b) {
	
	int c=a/b;
	System.out.println(c);
}


	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addTwoNumbers(50, 30);
		calc.subTwoNumbers(50, 30);
		calc.multipleTwoNumbers(50, 30);
		calc.divisionTwoNumbers(50, 30);
	}
}
