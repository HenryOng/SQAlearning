package testNg;
import org.testng.Assert;
import org.testng.annotations.Test;

import model.Calculator;



public class CalculatorTestNg{
	Calculator calc = new Calculator();

	@Test
	public void testAdd(){

		//		int result = calc.add(2,2);
		//		if(result == 4){
		//			System.out.println("Test case passes");			
		//		}else{
		//			String errorMsg = "Test case failed, Expected was : 4, actual is"+result;
		//			System.out.println(errorMsg);
		//			throw new RuntimeException(errorMsg);
		//		}

		Assert.assertEquals(calc.add(2, 2), 4);			
	}	
}

