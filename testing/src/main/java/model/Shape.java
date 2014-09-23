package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Shape {
	private String name;
	public int count = 10;
	
    public Shape (String name){
    		this.name = name;
    	}
        
    //This abstract method must be defined in a concrete subclass.
    //Note that it is called in this class in the toString method.
    public String getName(){    		
    		return name;
    	}
    
    
    public String printArea( ){
    		return "Name is "+getName()+" and area is "+this.getArea();
    	}
    
    //GetArea method is not used here. We have to declare it just for compilers' sake.
    protected double getArea(){
    		return 0.0;
    }       
}
