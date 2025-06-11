package startingjava;

public class StaticMethod {
//  for static function dont need to create an object
	
	public static void ExampleStaticFunction() {
		System.out.println("it is an example of the static function");
	}
	
	
	public void exampleofNonStatic() {
		System.out.println("it is an example of non static function");
	}
	
	public static void main(String[] args) {
		StaticMethod.ExampleStaticFunction();
	}
	
}
