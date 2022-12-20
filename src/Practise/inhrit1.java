package Practise;

public class inhrit1 {

	  double height;

	  double width ;
	
	 
	// default constructor
	public inhrit1() {
		  
		  height = width = 0.0;
		     
	  }
	  
	// parametrised constructor
	  public inhrit1( double w , double h) {
		  
		  this.width = w;
		  this.height = h;
		  
		  
	  }
		
	  // object in constructor 
	  public inhrit1 ( double x) {
		  
		  width= height = x;
		  
	  }
		
	  public void show () {
		  
		  System.out.println( " the values are  " + width + " " + height );
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
