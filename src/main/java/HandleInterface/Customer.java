package HandleInterface;

public class Customer {
	public static void main(String[] args) {
		Axis mybank = new Axis();
		mybank.aadharMandatory();
		boolean ispanmandotory = mybank.panmandatory();
		System.out.println(ispanmandotory);
		mybank.intrestfreeloan();


		// for interface we are not able to create a class because class has a default constructor	
		//		rbi kulla irukurathu than varum intrest free loan varauthu
		//		left side enna iruko adha than edukum

		RBI myrbi = new Axis();
		myrbi.aadharMandatory();
//		 we care not able to call a bikeloan which is in rbi interface
//		 we are not able to create a class
		
//		it is called by calss but not able to access the bikeloan in rbi interface
//		myrbi.bikeloan();
		
//		it is called by  static
//	interface can be used by static method
		RBI.bikeloan();
		
		


	}
}
