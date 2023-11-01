package HeirarachicalInheritance;

public class PermanentEmployee extends Employee{
 int salary;
 
 
 public void setSalary(int salary) {
	 this.salary=salary;
 }
 public int getSalary() {
	 return salary;
 }
 public void calculateSalary() {
	 salary=salary+25000;
 }
}
