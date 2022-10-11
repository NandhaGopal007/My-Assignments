package week1.day2;

public class Employeedetails {
	public void employeeName()
	{
		String EmployeeName="Nandha";
		int EmployeeID=220;
		System.out.print("Employee Name="+EmployeeName);
		System.out.println("Employee ID= "+EmployeeID);
	}
	public void EmployeeAddress() {
		String EmployeeAddress="Chennai";
		System.out.println("Empolyee Address ="+EmployeeAddress);
	}
	public void EmployeeSalary() {
		Double EmployeeWage=73532.65282;
		System.out.println("Empolyee Salary =Rs"+EmployeeWage+"/-");
	}
	public void EmployeeMobileNumber() {
		Long MobileNumber=7358593118L;
		System.out.println("Empolyee Mobile Number ="+MobileNumber);
	}
public static void main(String[] args) {
	Employeedetails details = new Employeedetails();
	 details.employeeName();
	 details.EmployeeAddress();
	 details.EmployeeSalary();
	 details.EmployeeMobileNumber();
}
}









