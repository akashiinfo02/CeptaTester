package Practise;

public class bike1 extends bike{

	
	
	public bike1 () {
		
		super();
		
		System.out.println(" here  we have all the details of bike rider");
	
	}
	
	public bike1(String color , String name , int model) {
		
		super ("black " ,"honda " , 350);
		
		System.out.println(" here we have bike detail");
		
	}
	
	
	public bike1(String color  , String name , int model , int bikno) {
		
		super ( " matty " , " suzukii ", 110 , 9397);
		
		System.out.println( " now we have complete details ");
	}
	
	
	
}
