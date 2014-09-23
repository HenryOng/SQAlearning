package testNg;

import model.Apple;
import model.Fruit;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FruitTest {
  	
  public void appleNameTest() {
	  System.out.println("Inside Fruit Test");
	  Fruit fruit = new Apple();
	  Assert.assertEquals(fruit.name(), "Apple");
  }
  	
  public void fruitNameTest(){
	  Fruit fruit = new Fruit();
	  Assert.assertEquals(fruit.name(), "Fruit");
  }
  
}
