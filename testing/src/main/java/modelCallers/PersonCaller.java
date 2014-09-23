package modelCallers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.SQAConnection;
import model.Person;

public class PersonCaller {
	
	public static void main(String args[]){
//		Person per = new Person();
//		per.setName("Mr.Red");
//		//per.totalPerson = 1;
//		
//		Person per2 = new Person();
//		per2.setName("Mr.Green");
//		//Person.totalPerson=2;
//		
//		System.out.println("total objects are : "+Person.totalPerson);
//		System.out.println("total objects are : "+per.totalPerson);
//		System.out.println("total objects are : "+per2.totalPerson);
		try{
			Connection dbConn = SQAConnection.getConnection();
			Statement stmt = dbConn.createStatement();
		      String sql;
		      sql = "SELECT * from student_info";
		      ResultSet rs = stmt.executeQuery(sql);
		      if(rs.next()){
		    	  
		      }
		}catch(Exception e){
			e.printStackTrace();
		}
		for(int i=0; i<100; i++){
			Person per3 = new Person();
			System.out.println("non-static property count for object :"+i+" : "+per3.nonStaticTotalPerson);
		}
		System.out.println("static property count: "+Person.totalPerson);	
	}	
}
