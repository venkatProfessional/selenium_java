package startingjava;

public class MyYoutube {

//	calling a functions from other class
	Youtuber yt = new Youtuber();
	
	
	// Constructor to call the method
//	it is like a constructor
//	public void callingfromotherclass() {
//		yt.shareVideo();
//	}
	
	 
  public static void main(String[] args) {
	  
//	 this is the one way to create an object 
	 Youtuber yt2 = new Youtuber();
	 yt2.createvideo();
	 new MyYoutube();
	 
}
	
	
	
	
}
