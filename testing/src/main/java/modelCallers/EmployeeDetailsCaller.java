package modelCallers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import model.EmployeeDetails;

public class EmployeeDetailsCaller {	
	static final Logger log = Logger.getLogger(EmployeeDetailsCaller.class);
	
	public List<EmployeeDetails> readEmployeesFromFile(String filePath){
		//"Users/prashantnagar/Dropbox/SQA/FileInput/EmployeeDetailsInput.txt"		
		
		BufferedReader reader = null;
		List<EmployeeDetails> employeeList = new ArrayList<EmployeeDetails>();
		try{
			File empFile = new File(filePath);
			FileReader fileReader = new FileReader(empFile);
			reader = new BufferedReader(fileReader);
			String empRow = null;
			//Start reading the input file.
			while((empRow=reader.readLine()) != null){
				//Split each row by "," to get String array
				String[] empArr = empRow.split(",");
				String empName = empArr[0];
				double empSalary = 0.0;
				int empAge = 0;
				//Converting the String to int. salary and age are of type int,
				//but when you read from file they are always String. So you have to convert them.
				//Wrapper class provides the functions to convert String to primitive type.
				try{
					empSalary = Double.parseDouble(empArr[1]);
					empAge = Integer.parseInt(empArr[2]);
				}catch(NumberFormatException nfe){
					log.error("Number format exception caught for : "+empName+", empSalary : "+empArr[1]+", empAge : "+empArr[2]);
					log.info("Setting the default values for these variables");
					continue;
				}

				//Creating the object of EmployeeDetails.
				EmployeeDetails empDetails = new EmployeeDetails();
				//Setting indiviudal properties from file to above object.
				empDetails.setName(empName);
				empDetails.setMonthlySalary(empSalary);
				empDetails.setAge(empAge);
				
				//Adding the above created object to EmployeeDetails List.
				employeeList.add(empDetails);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(reader != null){
				try{
					reader.close();
				}catch(Exception e){}
			}
		}
		return employeeList;
	}
	
	public List<EmployeeDetails> getUniqueEmployees(String filePath){
		
		//Create the array list object of employeeDetails which will have all unique employees
		List<EmployeeDetails> uniqueEmpList = new ArrayList<EmployeeDetails>();
		
		//Call the method defined above to read employees from given file
		List<EmployeeDetails> empList = readEmployeesFromFile(filePath);
		
		//Iterate through all the employees and check if they already exists in unique list.
		//if they exists then do not add otherwise add them.
		for(EmployeeDetails emp : empList){
			if(!uniqueEmpList.contains(emp)){
				uniqueEmpList.add(emp);
			}else{
				log.info("Duplicate employee found : "+emp.getName());
			}
		}
		return uniqueEmpList;
	}
		
}
