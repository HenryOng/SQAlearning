package model;

public class Employee {
	private int empId;
	private String name;
	private String deptName;
	
	public Employee(){
		
	}
	
	public Employee(int empId, String name, String deptName){
		this.empId = empId;
		this.name = name;
		this.deptName = deptName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}	
}
