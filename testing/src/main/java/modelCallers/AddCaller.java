package modelCallers;

import model.Add;

public class AddCaller {
	
	public static void main(String args[]){
		Add addFunction = new Add();
		int sum = addFunction.getSum(5, 5);
		System.out.println("sum of int, int : "+sum);
		
		float sumFloat = addFunction.getSum(3.5f, 5.5f);
		System.out.println("sum of float, float : "+sumFloat);
		
		
		float sumIntFloat = addFunction.getSum(3, 5.5f);
		System.out.println("sum of int, float : "+sumIntFloat);
	}
}
