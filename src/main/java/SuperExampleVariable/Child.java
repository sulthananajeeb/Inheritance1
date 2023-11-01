package SuperExampleVariable;

public class Child extends Parent {
	int b = 50;

	public void printVariable() {
		System.out.println(super.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child d = new Child();
		d.printVariable();
	}

}
