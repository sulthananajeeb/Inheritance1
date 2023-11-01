package inheritancePgmOne;

public class Student extends Person {
	String course;
	public void setCourse(String course) {
		this.course=course;
	}
	public String getCourse() {
		return course;
	}
	public void printStudentDetails() {
		System.out.println("Course is "+getCourse());
		displayDetails();
	}	public static void main(String[] args) {
		Student obj=new Student();
		// TODO Auto-generated method stub
		obj.setName("Sulthana");
		obj.setPlace("Kochi");
		obj.setCourse("Java Automation ");
		obj.printStudentDetails();
	}

}
