package Practise;

public class dsy1 {
	
	public void area() {
		
		
		
		System.out.println(" the are of the figure is showed");
	}
	
	public int area( int r) {
		
		double area = 3.14 *r*r;
		 System.out.println(" thte arae is " + area);
		return r;
		
		 
	}
	
	public double area(  double  r , double h) {
		
		double area = 3.14 * r* r* h;
		System.out.println(" the area of the cylinder is  " + area);
		return area;
		
	}
	
	static {
		
		System.out.println(" we are finding the areas");
	}
	
	public static void main(String[] args) {
		
		System.out.println(" my name is aksash");
		
		dsy1 d = new dsy1();
		d.area();
		d.area(5);
		d.area(5.1,6.1);
		
	
		
		
	}

}
