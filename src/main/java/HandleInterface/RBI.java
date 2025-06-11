package HandleInterface;

public interface RBI {
//	abstract a function without a body is called abstract function
//	all are public in abstract class
//	abstract class kulla edhu declare pannalum static final
	
	int UPIlimit = 100000;
	public void aadharMandatory();
	boolean panmandatory();
	void licenseMandatory();
	
//	in interface it is possible to make a block with default and static keyword
	
	default void HousingLoan() {
		System.out.println("howsing loafn will be provided in all banks");
	}
	
	static	void bikeloan() {
		System.out.println("bike loan will be provided");
	}
	
	void example();
}
