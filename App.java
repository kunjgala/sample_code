package oops4;
//constructor
//constructor name should be same as that of class name and has no return type
//constructor is used to declare anything or run anything that we want it to run by default irrespective of anything
//constructor can also be used to set default values of variables
//we can create any number of constructors/methods with same name unless its parameters are different
//we can also call one constructor inside another constructor
// we can do this by using 'this(pass parameters)' if there are no parameters then - 'this()'
// also any constructor can be called by initializing it as first statement inside constructor


class Machine {
	
	private String name;
	private int age;
	public Machine() {
		this("kunj",0);
		System.out.println("Constructor running");
		name="kunj";
		
	}
	
	public Machine(String name) {
		System.out.println("Constructor 2 running");
		this.name=name;
	}
	
	public Machine(String name, int age) {
		System.out.println("Constructor 3 running");
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		System.out.println("Contructor Name: " + machine1.getName() + " Age: " + machine1.getAge());
		Machine machine2 = new Machine("Beena");
		System.out.println("Contructor Name: " + machine2.getName());
		Machine machine3 = new Machine("Kinjal", 25);
		System.out.println("Contructor Name: " + machine3.getName() + " Age: " + machine3.getAge());
	
}
}
