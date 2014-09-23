package modelCallers;

import model.Circle;
import model.Shape;
import model.Triangle;

public class CircleCaller {
	public static void main(String args[]){		
		Shape myCircle = new Circle("blueCircle",5);
		//double area = myCircle.getArea();
		String area = myCircle.printArea();
		//System.out.println(myCircle.count);
		//myCircle.myStatic();
		System.out.println(area);
		
		Shape myTriangle = new Triangle("redTriangle",5.0f, 4.0f);
		String triangleArea = myTriangle.printArea();
		System.out.println(triangleArea);
		
		Shape[] shpArr = new Shape[2];
		shpArr[0] = myCircle;
		shpArr[1] = myTriangle;			
	}
}
