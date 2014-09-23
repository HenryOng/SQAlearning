package model;

public class Car extends Vehicle{
	private int engineCap;
	private boolean isFourWheel;	
	
	public Car(){
		System.out.println("This is from Car");
	}
	
	public Car(int engineCap, boolean isFourWheel, int maxSpeed, String color, String model){
		super(maxSpeed, color, model);
		this.engineCap = engineCap;
		this.isFourWheel = isFourWheel;
		System.out.println("This is from Car");
	}
		
	
	public static void main(String args[]){
		Car myCar1 = new Car();
		//Car myCar = new Car(5,true,20,"blue","Nisan");
		String color = myCar1.getColor();
		String model = myCar1.getModel();
		//model = null;
		if(model.equals("myModel")){
			//null.equals("mymodel")
			
		}		
		int myCap = myCar1.getEngineCap();		
	}	
	
	public int getEngineCap() {
		return engineCap;		
	}
	public void setEngineCap(int engineCap) {
		this.engineCap = engineCap;
	}
	public boolean isFourWheel() {
		return isFourWheel;
	}
	public void setFourWheel(boolean isFourWheel) {
		this.isFourWheel = isFourWheel;
	}
	
//	public int getMaxSpeed() {
//		return 5;
//	}
}
