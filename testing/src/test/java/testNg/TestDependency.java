package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.MessageUtil;

public class TestDependency {
	String message = "John";
	MessageUtil messageUtil = new MessageUtil(message);

//	@Test
//	public void testPrintMessage() {
//		System.out.println("Inside testPrintMessage()");
//		message = "John";
//		Assert.assertEquals(message, messageUtil.printMessage());
//	}

	@Test(dependsOnMethods = { "initEnvironmentTest" }, alwaysRun=false)
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Welcome " + "John";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}

	@Test
	public void initEnvironmentTest() {
		System.out.println("This is initEnvironmentTest");
		//Assert.fail();
	}
}
