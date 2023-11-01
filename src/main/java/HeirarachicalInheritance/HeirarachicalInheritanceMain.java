package HeirarachicalInheritance;

public class HeirarachicalInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pe=new PermanentEmployee();
		pe.setName("Sulthana");
		pe.setId(41);
		System.out.println("Name is"+pe.getName());
		System.out.println("Id is"+pe.getId());
		pe.setSalary(50000);
		pe.calculateSalary();
		System.out.println("Salary  is"+pe.getSalary());
		
		System.out.println("-------Contract Employee---------");
		ContractEmployee ce=new ContractEmployee();
		ce.setName("Sulthana Najeeb");
		ce.setId(41);
		ce.setPayment(45000);
		ce.setPayroll("Xgen");
		System.out.println("Name    "+ce.getName());
		System.out.println("Id        "+ce.getId());
		ce.display();
		
	}

}
