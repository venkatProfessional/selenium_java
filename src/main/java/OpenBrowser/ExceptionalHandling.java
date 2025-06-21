package OpenBrowser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionalHandling {
	public static void main(String[] args) {

//		lets made a 1 % 0 exceptional
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number :");
		
	
		
	
//		at OpenBrowser.ExceptionalHandling.main(ExceptionalHandling.java:13)
//		need to handle the exceptional it is an run time exceptional
            
		
		try {
			int num = in.nextInt(); //1
			int a = num % 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace(); //shows an actual error
			e.getMessage(); // print a error as a message
		}catch(InputMismatchException e){
//			System.out.println(e);
//			System.err.println(e); // shows in red
			System.out.println("please provide only a number");
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			in.close();
		}
		
	}
}

//Error - 
//impossible to recover from errors
//happen at runtime
//caused by the environment that the application is running
//eg:	java.lanf.stacoverflowerror


//exceptional 		
//recovery is possible
//run time and compile time both
//caued by application
//arrayoutogbounryExceptional , nullpointerEExceptional ,classcaseExceptiona;

