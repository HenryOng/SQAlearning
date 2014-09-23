package junitTests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MyFeatureTest {

	@Test @Category(UnitTests.class)
	public void testFast() {
		System.out.println("fast");
	}
	
	@Test @Category(IntegrationTests.class)
	public void testSlow() {
		System.out.println("slow");
	}
	
	@Test @Category({UnitTests.class, IntegrationTests.class})
	public void testSanity() {
		System.out.println("sanity");
	}
}
