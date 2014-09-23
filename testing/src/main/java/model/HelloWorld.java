package model;

public class HelloWorld{
 		
	public static void main(String args[]){
		
		String[] strArr = new String[]{"red","blue","black"};
		
		try{
			System.out.println("1");			
			System.out.println(strArr[5]);
			//Dummy logic to assign the array to null, so that we can test
			//null pointer
			if(1==1){
				strArr = null;
			}			
			System.out.println("1:"+strArr[2]);
			//This line or any line here after will not get executed
			System.out.println("2: after reading array");
			//continue with the file operation
		}catch(NullPointerException npe){
			npe.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException aie){
			aie.printStackTrace();
		}catch(RuntimeException rte){
			rte.printStackTrace();
			System.out.println("3: Exception caught of type : "+rte.getMessage());
			//System.out.println("Inside runtime exception catch block");
		}catch(Exception e){
			//This is the super class, everthing will get caught here			
		}finally{
			System.out.println("4 : This will get exectued regardless of anything");
		}
		System.out.println("5 : After exception");
	}		
}