package testNg;

import model.Calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import exercise.PrimeNumber;

public class ParamTestWithDataProvider1 {
	private PrimeNumber primeNumberChecker;
	private Calculator calc;

	@BeforeMethod
	public void initialize() {
		primeNumberChecker = new PrimeNumber();
		calc= new Calculator();
	}

	@DataProvider(name = "test1")
	public static Object[][] primeNumbers() {
		return new Object[][] { { 2, true }, { 6, false }, { 19, true },
				{ 22, false }, { 23, true } };
	}	


	@Test(dataProvider = "test1")
	public void testPrimeNumberChecker(Integer inputNumber,
			Boolean expectedResult) {
		System.out.println(inputNumber + " " + expectedResult);
		Assert.assertEquals(expectedResult,
				primeNumberChecker.validate(inputNumber));
	}

	@Test(dataProvider = "calcTest")
	public void testAdd(int opr1, int opr2, int result){
		int calcResult = calc.add(opr1, opr2);
		Assert.assertEquals(calcResult, result);
	}

	@DataProvider(name = "calcTest")
	public static Object[][] getCalcInput() {
		return new Object[][] { { 2, 2,4 }, { 6, 6,12 }, { 19, 19,38 },
				{ 22, 22,44 }, { 23, 23,46 } };
	}
	
	@Test (dataProvider = "calcTest2")
	public void testSub(int opr3, int opr4, int result){
		int calcResult = calc.sub(opr3, opr4);
		Assert.assertEquals(calcResult, result);
	}

	@DataProvider(name = "calcTest2")
	public static Object[][] getCalcInput2() {
		return new Object[][] { { 2, 2,0 }, { 6, 6,0 }, { 10, 10,0 }};
	}
}


