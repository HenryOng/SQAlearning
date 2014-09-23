package junitTests;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import model.EmployeeDetails;
import modelCallers.EmployeeDetailsCaller;

public class EmployeeDetailsTest{

	@Before
	public void init(){
	//	empCaller = new EmployeeDetailsCaller();
	}
	
	@Test	
	public void EmployeeReadFromFile(){
		//Add all the logic to call the employeeDetails and check the outcome
		EmployeeDetailsCaller empCaller = new EmployeeDetailsCaller();
		List<EmployeeDetails> employeeDetails = empCaller.readEmployeesFromFile("/Users/henryong/Desktop/LearningInput/EmployeeDetailsInput.txt");
		Assert.assertEquals(employeeDetails.size(),5);		
	}
	//testing without removing depulicates
	
	
	@Test
	public void UniqueEmployeesFromFile(){
		EmployeeDetailsCaller empCaller = new EmployeeDetailsCaller();
		List<EmployeeDetails> employeeDetails = empCaller.getUniqueEmployees("/Users/henryong/Desktop/LearningInput/EmployeeDetailsInput2.txt");
		Assert.assertEquals(3,employeeDetails.size());	
	}
	//testing while removing the duplicates
}
	
	
	
	//getUniqueEmployees
