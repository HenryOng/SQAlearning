package testNg;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Calculator;
import static org.testng.Assert.assertEquals;


public class TestNGSimpleTest {
	static int j=0;
	@BeforeTest
	
	public void beforeTest() {
		
		System.out.println("in beforeTest 2");
		//implement the logic that should get executed before any of your tests are triggered.		
	}

	@Test
	public void testMsg() {
		String str = "TestNG is working fine";
		System.out.println("TestNG simple test");
		assertEquals("TestNG is working fine", str);
	}
	s
	//This test will be ignored
	@Test (enabled = false)
	public void testCalc() {
		Calculator calc = new Calculator();				
		assertEquals(calc.add(2, 2), 4);
	}	

	//This test expects the NullPointerException to be thrown
	@Test(expectedExceptions = NullPointerException.class)
	public void testNullPointerException() {
		Calculator calc = null;
		int size = calc.add(2, 2);
	}

	//This test will run 10 times and if it takes more than 100 ms then it will fail
	@Test(invocationCount=10, invocationTimeOut=100)
	public void testInvocationTest(){		
		System.out.println("in invocation");		
		assertEquals(1, 1);
	}

	//This test will run 10 times and if less than 9 test cases fails then it will fail 
	@Test(invocationCount=10, successPercentage=90)
	public void testPercentageTest(){		
		j++;
		if(j==2){
			Assert.fail();
		}		
	}
}
