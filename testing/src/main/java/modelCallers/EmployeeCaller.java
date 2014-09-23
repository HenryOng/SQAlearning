package modelCallers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Employee;

public class EmployeeCaller {

	public static void main(String args[]){
		EmployeeCaller empCall = new EmployeeCaller();
		List<Employee> empList = empCall.setEmployeeInfo();
		int i = 1;
		//Way to iterate through the employee list
		
		for(Employee emp : empList){
			if(emp.getDeptName().equals("IT")){
				System.out.println(i+" Employee is from IT");
			}else if(emp.getDeptName().equals("HR")){
				System.out.println(i+" Employee is from HR");
			}else if(emp.getDeptName().equals("Ops")){
				System.out.println(i+" Employee is from Ops");
			}
			i++;
		}
		
		Map<Integer,Employee> empMap = new HashMap<Integer,Employee>();
		for(Employee emp : empList){
			Integer empId = emp.getEmpId();			
			empMap.put(empId, emp);
		}
		
		//I want to do it in a generic way where I dont put hardcoded values.
		Map<String, List<Employee>> empMapList = new HashMap<String,List<Employee>>();
		for(Employee emp : empList){
			String deptName = emp.getDeptName();
			List<Employee> tempList = empMapList.get(deptName);
			if(tempList == null){
				tempList = new ArrayList<Employee>();
				empMapList.put(deptName, tempList);
			}
			tempList.add(emp);
		}
		System.out.println(empMapList.size());
		
		for(Map.Entry<String,List<Employee>> entrySet : empMapList.entrySet()){
			String depName = entrySet.getKey();
			List<Employee> rList = entrySet.getValue();
			rList.get(4);
			System.out.println(depName+" has : "+rList.size()+" employees");
		}
	}

	private List<Employee> setEmployeeInfo(){
		List<Employee> employeeList = new ArrayList<Employee>();
		
		//Set 80 employees that belongs to IT department
		for (int i=1; i<=80; i++){
			Employee emp = new Employee(i, "Employee"+i, "IT");
			employeeList.add(emp);
		}

		//Set 10 employees that belongs to HR department
		for (int i=81; i<=90; i++){
			Employee emp = new Employee(i, "Employee"+i, "HR");
			employeeList.add(emp);
		}

		//Set 10 employees that belongs to Operations department
		for (int i=91; i<=100; i++){
			Employee emp = new Employee(i, "Employee"+i, "Ops");
			employeeList.add(emp);
		}		
		return employeeList;
	}
}
