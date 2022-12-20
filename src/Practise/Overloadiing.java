package Practise;

public class Overloadiing {

	public void overdemo() {
		
		System.out.println( " it has no parameters ");
	}
	
	public int overdemo( int a ) {
		
		System.out.println( " it has one parameter i.e" + a);
		return a;
		
	
	}
	
	public int overdemo( int a , int b) {
	
		
		System.out.println(" it has two parametes i.e " + a + " " +  b+" ");
	return a +b;
	
	}
	
	 public double overdemo( double a , double b ) {
		
		System.out.println( "it has 3 parameters " + a + "   "+ b );
		return a+b;
	}
	
	static {
		System.out.println(" we are doing overloading");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Overloadiing ob = new Overloadiing();
	 double resd;
	
		ob.overdemo();
		System.out.println();
		
		ob.overdemo(5);
		System.out.println();
		
		ob.overdemo(5,6);
		System.out.println();
		
		resd=ob.overdemo(5.1,6.2);
		System.out.println(" result of ob.overdemo(5.1,6.2) is " + resd);
	}

}
