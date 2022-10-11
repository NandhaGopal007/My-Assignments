package Mobile;

public class calculator {
	public void addTwoNumbers(int a,int b) {

		int c = a+b;
		System.out.println("addTwoNumbers       ="+c);
	}
	public void substractTwoNumbers(int e,int f) {

		int t = e-f;
		System.out.println("substractTwoNumbers ="+t);
	}
    public void mutiplyTwoNumbers(double i,double j) {

		double s = i*j;
		System.out.println("mutiplyTwoNumbers   ="+s);
	}
    public void divideTwoNumbers(float x,float y) {

		float z = x/y;
		System.out.println("divideTwoNumbers    ="+z);
	}
    public static void main(String[] args) {
    	calculator calc=new calculator();
    	calc.addTwoNumbers(27, 22);
    	calc.substractTwoNumbers(51, 46);
    	calc.mutiplyTwoNumbers(713.678, 984.864);
    	calc.divideTwoNumbers(222.7f, 764.1f);

    }
}
