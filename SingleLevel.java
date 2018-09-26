package Inheritance;

public class SingleLevel {

	public static void main(String[] args) {
		B obj = new B();
		obj.add();
		obj.sub();

	}

}
  class A
  {
	  public void add()
	  {
		  System.out.println("addition");
	  }
  }
  class B extends A
  {
	  public void sub() {
		  System.out.println("subtraction");
	  }
  }
