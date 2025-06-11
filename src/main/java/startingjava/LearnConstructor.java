package startingjava;

public class LearnConstructor {

//	the constructor sets a default value as 0 and null
	int x ;
	String name;

// How to create an constructor
// class name and constructor name must be same
	
	public LearnConstructor(int num ,String names) {
		 this.x =num;
		 this.name = names;
	}
	
	
//	constructor sets a default variable 
	
	public void Exampleconstuctor() {
		System.out.println(x);
		System.out.println(name);
		
	}
	
	
	public static void main(String[] args) {
		  LearnConstructor l1 = new LearnConstructor(5, "Vijay");
		   System.out.println("x: " + l1.x);
	       System.out.println("name: " + l1.name);
	       
	       LearnConstructor l2 = new LearnConstructor(6, "Ajith");
		   System.out.println("x: " + l2.x);
	       System.out.println("name: " + l2.name);
		
	}
	
}
