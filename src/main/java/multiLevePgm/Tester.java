package multiLevePgm;

public class Tester extends Employee {
String specification;
public void setSpecification (String specification) {
	this.specification=specification;
}
public void printEmployeeDetails() {
	//displayDetails();
	System.out.println("Employee id is ==>"+empId);
	System.out.println("Specification is ==>"+specification);
}

}
