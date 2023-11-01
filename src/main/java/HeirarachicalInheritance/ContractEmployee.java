package HeirarachicalInheritance;

public class ContractEmployee extends Employee{
	int salary;
	String payRoleCompany;
	
	
	public void setPayment(int salary) {
		this.salary=salary;
	}
	public int getPayment() {
		return salary;
	}
	public void setPayroll(String payRoleCompany) {
		this.payRoleCompany=payRoleCompany;
	}
	
	public String getPayroll() {
		return payRoleCompany ;
	}
	 public void calculateSalary() {
		 salary=salary+15000;
	 }
	 public void display() {
		 calculateSalary();
		 System.out.println("Salary is"+getPayment());
		 System.out.println("Payroll is"+getPayroll());
	 }

}
