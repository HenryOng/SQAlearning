package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {
	
	public static void main(String args[]) throws MyException {
		ExceptionExample example = new ExceptionExample();
		int division = 0;
		boolean exception = false;
		try{
			division = example.calculateDivision("abc");
		}catch(FileNotFoundException fe){
			fe.printStackTrace();
			exception = true;
		}		
		
		if(exception == true){
			throw new MyException("this is my exception");
		}else{
			System.out.println("No Exceptions");
		}
	}
	
	public int calculateDivision(String fileName) throws FileNotFoundException{
		
		//Read the file and read the parameters and do the division
		
			File file = new File("/Users/prashant/test.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			return 0;
						
		//read the file and perform the division		
	}
	
}
