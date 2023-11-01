package SuperExampleMethod;

public class DerivedClass extends BaseClass{
    public void displayMethod() {
    	System.out.println("This is the Child class");
    	
    }
    public void showMethod() {
    	displayMethod();
    	super.displayMethod();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass dc=new DerivedClass();
		dc.showMethod();
	}

}
