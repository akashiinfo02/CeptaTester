package Practise;

public class inheritnc2 extends inheritnc1 {

	public inheritnc2 () {
		
		super();
		System.out.println(" this is constructor from inherit2");
	}
	
	
	public void  display2() {
		
		System.out.println( " this is display2");
	}
	
	
	public void print2() {
		
		System.out.println(" this is print2");
	}
	
	
	
	public void show() {
		
		super.display1();
		
		this.display2();
	}
	
	
	
	
}
