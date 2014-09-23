package model;

public class Add {
	
	public int getSum(int a, int b){
		int sum =  a+b;
		System.out.println("Overloaded of type int, int");
		return sum;
	}
	
	public float getSum(float a, float b){		
		float sum = a+b;
		System.out.println("Overloaded of type float, float");
		return sum;
	}
	
	public float getSum(int a, float b){
		float sum =  a+b;
		System.out.println("Overloaded of type int, float");
		return sum;
	}
	
	public float getSum(float a, int b){
		float sum =  a+b;
		System.out.println("Overloaded of type int, float");
		return sum;
	}
}
