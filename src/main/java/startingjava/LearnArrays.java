package startingjava;

import java.util.Arrays;

public class LearnArrays {	
	public static void main(String[] args) {
		String[] guns = {"ARM","AKM","AK14","Groza","M416"}; 
		System.out.println(guns[1]);
		
		int lastvalue = guns.length -1;
		System.out.println(lastvalue);
		
	    System.out.println(guns[lastvalue]);
	    
//	    to print the full Array
	    System.out.println(Arrays.toString(guns)); 
	    
	}
}
