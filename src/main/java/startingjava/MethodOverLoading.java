package startingjava;

public class MethodOverLoading {
	
//	duplicated method is not allowed in java
//	methods with different parameter is allowed
	
//The Function with same name but different parameter is called
//method overloading	
	
	public void deletevideo(String id) {
		System.out.println(id+" "+" id video is deleted");
	}
	
	public void deletevideo(int id) {
		System.out.println(id+" "+" id video is deleted");
	}

	
	
	

	public static void main(String[] args) {
		
		MethodOverLoading m1 = new MethodOverLoading();
		m1.deletevideo(5);
				
		
	}
}
