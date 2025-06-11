package startingjava;

public class LearnThisandInstance {
	
//	this is instance variable no need to intialize
	int c=4;
	
	public int num() {
		return 1;
	}
	
	public void localexample(int a , int b,int c) {
		int d=0; //this is local variable must be initialize
//		we cannot print the local variable without initialization
//		atleast we have initialize as 0
		System.out.println(d);
		System.out.println(a+b+c);
//		this refers the current class of the instance 
//		which the refers the outside of the function
		System.out.println(a+b+this.c);
		System.out.println(this.num());
		
	}
	
	
	public static void main(String[] args) {
		 
		LearnThisandInstance l1 = new LearnThisandInstance();
		l1.localexample(2, 4,5);
	}

}
