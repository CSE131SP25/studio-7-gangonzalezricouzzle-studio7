package studio7;

public class Rectangle {
	private double w;
	private double p; 
	private double l; 
	private double a; 
	
	public Rectangle (double length, double width) {
		l = length; 
		w = width; 
	}
	
	public double areacalc () {
		a = l*w;
		return a; 
	}
	
	public double perimetercalc () {
		p = (l)+(l)+(w)+(w);
		return p; 
	}	
	
	public void size(Rectangle r1, Rectangle r2) {
		if (r1.areacalc() > r2.areacalc()) {
			System.out.println ("Rectangle 1 is larger than rectangle 2"); 
		}else if (r1.areacalc() < r2.areacalc()) {
			System.out.println ("Rectangle 2 is larger than rectangle 1"); 
		}else {
			System.out.println ("Rectangle 1 is equal to rectangle 2"); 
		}
	}
	
	public void square() {
		if (l == w) {
			System.out.println("The rectangle is a sqaure"); 
		}
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (5.0, 7.0);
		Rectangle r2 = new Rectangle (7.0, 5.0);
		System.out.println(r1.areacalc()); 
		System.out.println(r1.perimetercalc()); 
		r1.size(r1, r2);
		r1.square();
	}

}
