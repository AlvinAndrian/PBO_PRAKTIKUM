package ContohGeneric;

class Main {
	  public static void main(String[] args) {

	    // initialize the class with Integer data
	    DemoClass demo = new DemoClass();

	    // generics method working with String
	    demo.<String>genericsMethod("Hallo semuaaa");

	    // generics method working with integer
	    demo.<Integer>genericsMethod(25);
	  }
	}

	class DemoClass {

	  // creae a generics method
	  public <T> void genericsMethod(T data) {
	    System.out.println("Generics Method:");
	    System.out.println("Data Passed: " + data);
	  }
	}
