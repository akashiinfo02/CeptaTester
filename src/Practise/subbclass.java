package Practise;

public class subbclass extends Parentclass {

	
	
	subbclass () {
		
		super(); // here we are calling constructor of parent class which is non parameterised ( with no parameters)
		System.out.println( "  this is child class constructor");
	}
	
	
	
	subbclass ( int num ) {    // constructor with paarameter
		
		System.out.println(" this constror contains value / parameter ");
	}
	
	
	public void display () {
		
		System.out.println(" hoello guzz");
	}
	
	
	
	
	
}
