package Practise;

public class statiic {

	
	static int multiply ( int a , int b) {
		
		System.out.println(" the two parameters are " + a + " " + b);
		return a*b;
		
	}
	
	static double multiply ( double a , double b , double c) {
		
		System.out.println(" the 3 parameters are " + a+ " "+ b+ " "+ c);
		return a + b + c;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multiply(5,6);
		
		System.out.println(statiic.multiply( 1.1 , 1.2 , 1.3));
		
	}

}
