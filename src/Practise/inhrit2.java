package Practise;

public class inhrit2 extends inhrit1 {

	  String style ;
	
	public inhrit2()  {
		
		super ();
		this.style = "none";
		
	}
	
	
	public inhrit2( double w , double h , String s) {
		
		super ( w , h );
		this.style = s;
		
		
	}
	
	// argument constructor 
	public inhrit2 ( double x) {
		
		super (x);
		this.style = "filled";
	}
	
	public void showstyle() {
		System.out.println( " vakue of inhrit2 is " + style);
	}
	
	
	
	
	
	
	
	
	
	
}
