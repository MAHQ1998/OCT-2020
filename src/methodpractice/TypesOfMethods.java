package methodpractice;


// package name : all lower case 
// class name : Starts with UpperCase and then goes CamelCase
// variable/methodName : starts with lowerCase and then goes CamelCase
// Constructor Name : Same name as class name --> Starts with UpperCase and then goes CamelCase
public class TypesOfMethods {

	public static void main(String[] args) {

		printMyName();
		String cup = getMeACoffee();
		System.out.println(cup);
		System.out.println("I am throwing the "+cup);
		
		// ClassName obj/refVar = new ConstructorName()
		TypesOfMethods typesOfMethods=new TypesOfMethods();
		
		typesOfMethods.printMyAge();
		
		int age = typesOfMethods.getMyAge();
		int newAge = age+5;
		System.out.println("my age after 5 years from now is "+newAge);
		
		boolean answer = isItSunnyToday();
		System.out.println(answer);
		
	}	


	// static void methods 
	public static void printMyName() {
		System.out.println("Zann");
	}
	
	// non static void method
	public void printMyAge() {
		System.out.println(25);
	}
	
	// return type method --> needs to be stored them somewhere 
	
	// static return type methods 
	public  int getMyAge() {
		return 30;
	}
		
		
	// non static return type method
	public static String getMeACoffee() {
		return "espresso";
	}
	
	public static boolean isItSunnyToday() {
		return false;
	}
	
	//public static/nonstatic datatype nameOfTheMethod(){
	// return "what you want to return";
	//}
	
	
}
