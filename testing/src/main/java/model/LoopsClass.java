package model;

/*
 * This class talks about Java loops. For each, do while and while loop.
 */
public class LoopsClass {
	
	public static void main(String args[]){
		//for loop function
		//explainForLoop();
		//explainWhileLoop();
		String[] myArr = new String[]{"red","blue","orange","yellow","green"};
		passArray(myArr);
	}
	
	public static void passArray(String[] arrToRead){
		for(int i=0; i<arrToRead.length; i++){
			System.out.println(arrToRead[i]);
		}
		
		for(String str : arrToRead){
			System.out.println(str);
		}
	}		
	
	public static void explainForLoop(){
		int[] numArr = new int[]{1,2,3,4,5};			
		//old for loop
		for(int i=4; i>=0; i--){			
			System.out.println(numArr[i]);
		}
		
		for (int value : numArr){
			System.out.println(value);
		}
	}
	
	public static void explainWhileLoop(){
		int[] numArr = new int[]{1,2,3,4,5};		
		int i=0;
		while(true){
			System.out.println("i = "+i);
			if(i==10){
				break;
			}
			i++;
		}
	}
}
