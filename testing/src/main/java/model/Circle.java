package model;

public class Circle extends Shape{
	private double radius; 
	public int count = 5;
	
    public Circle (String name, double r){
    		super(name);      
    		this.radius = r;
    }
	

    //Overide the abstract method declared in shape
	protected double getArea(){
    		return 3.14 * radius * radius;
    	}		
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}	
  }
