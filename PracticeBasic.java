package JavaLearning;

public class PracticeBasic {
	
	//default constructor no return type
	PracticeBasic(){
		System.out.println("hello I am default constructor");
	}
	
	//static variable
	static String varA = "Sonal SHarma";
	
	//static method
	static void Method1() {
		System.out.println("Hey I am static method");
	}
	
	public void run() {
		System.out.println("Checking simple method run by object");
	}
	
	public static void main(String[] args) {
		PracticeBasic obj = new PracticeBasic(); //created to call default constructor
		PracticeBasic.Method1();				//called static method using className
		System.out.println(varA + " " + "Hey I am default variable"); //printed static variable value
		obj.run();
		
	}
	
}
