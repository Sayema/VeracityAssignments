
public class ChildClass extends AbstractClass {
	
	ChildClass() {
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		//AbstractClass ab = new AbstractClass();
	}

}
