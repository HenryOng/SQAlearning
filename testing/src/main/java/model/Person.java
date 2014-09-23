package model;


public class Person {
	private String name;
	private String address;
	private int age;
	private String city;
	public static int totalPerson;
	public int nonStaticTotalPerson;
	
	//this is default constructor
	public Person(){
//		this.city = "Oakland";
//		System.out.println("SEtting city to oakland");
//		ObjectDemo demo = new ObjectDemo();		
//		demo.getToAccess();
		totalPerson++;
		nonStaticTotalPerson++;
		city = "abc";
	}
	
	//this is overloaded constructor
	public Person(String city){		
		this.city = city;
	}
	
	public void Person(){
		this.city = "Union City";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//Trying to access a non-static method from static method
//	public static String getNames(){
//		//This is a non-static method
//		String city =  getCity();
//		return city;
//		//This is equivalent to :
//		//return getCity();
//	}
	
	//Trying to access a static method from non-static method
//	public String getTotalPerson(){
//		//This is a static method
//		return getNames();
//	}
}
