package Constructer;

class Cylinder{
	private double height;	
	private double radius;
	
	//Properties methods
		
		public Cylinder() {
			radius=height=1;
		}
		
		public Cylinder(double h, double r) {
			height=h;
			radius=r;
		}
//		
//		public Cylinder(int r) {
//			setRadius(r);
//		}
//	
//		public Cylinder(int r, int h) {
//			setRadius(r);
//			setHeight(h);
//		}
		
	
	
	//Get methods
	
	public double getHeight() {
		return height;
		
	}
	
	public double getRadius() {
		return radius;
	}
	

	//Set methods
	public void setHeight(double h) {
		if(h>=0) 
			height=h;
			else height=0;
		}
	
	public void setRadius(double r) {
		if(r>=0) 
			radius=r;
			else radius=0;
		
	}
		
	public void setDimension(double r, double h ) {
			height=h;
			radius=r;
		}
	
//	Formulas
	
	public double lidArea() {
		return Math.PI*radius*radius;
	}
		
	
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	
	public double drumArea() {
		
		return 2*lidArea()+perimeter()*height;
	}
	
	public double volume() {
		return lidArea()*height;
	}
	



public class Cylinders {
	
public static void main(String[] args) {
		
		Cylinder c =new Cylinder();
		c.setHeight(10);
		c.setRadius(2.8);
		System.out.println("LidArea"+c.lidArea());
		System.out.println("Perimeter"+c.perimeter());
		System.out.println("Total Surface"+c.drumArea());
		System.out.println("Volume"+c.volume());
		System.out.println("Height"+c.height);
		System.out.println("Radius"+c.radius);
	}
		
	}


}
