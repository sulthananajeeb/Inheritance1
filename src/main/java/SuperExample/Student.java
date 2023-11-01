package SuperExample;

public class Student extends Person {
	String course;
	Student(String name,int age,String course){
		super(name,age);
		this.course=course;
	}
	public void display2() {
		display();
		System.out.println("Course===>"+course);
	}
	public static void main(String[] args) {
		Student s=new Student("Student",12,"Qa");
		s.display2();
	}

}
