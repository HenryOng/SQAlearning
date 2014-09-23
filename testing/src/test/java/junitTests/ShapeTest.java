package junitTests;

import model.Car;
import model.Shape;
import model.Triangle;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {
	@Test
	public void testShapeName(){
		//Name, base, height
		Shape sh = new Triangle("myTriange",5,4);
		//use assert equals to compare name v/s sh.getname();
		Assert.assertEquals(sh.getName(), "myTriange");
	}
	
	@Test
	public void testShapeBase(){
		//Name, base, height
		Shape sh = new Triangle("myTriange",5.0f,4.0f);
	}
	
	@Test
	public void testShapeHeight(){
		//Name, base, height
		Shape sh = new Triangle("myTriange",5,4);
	}
	
	@Test
	public void testShapeArea(){
		//Name, base, height
		Shape sh = new Triangle("myTriange",5,4);
	}
}
