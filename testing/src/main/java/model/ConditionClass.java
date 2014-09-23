package model;

public class ConditionClass {
	private static int compareNumber = 10;
	
	public static void main(String args[]){
		
		System.out.println("Testing if condition");
		evaulate(0);
		
		System.out.println("Testing Switch condition");
		printMonth(13);
	}
	
	public static void evaulate(int toCompare){
		if(toCompare > 10){
			System.out.println("Number is greater than 10");
		}else if(toCompare < 10){
			System.out.println("Number is less than 10");
		}else{
			System.out.println("Numbers are equal");
		}
	}
	
	public static void printMonth(int month){
		switch(month){
		case 1:
			System.out.println("This is January");
			break;			
		case 2:
			System.out.println("This is February");
			break;
		case 3:
			System.out.println("This is March");
			break;
		case 4:
			System.out.println("This is April");
			break;
		case 5:
			System.out.println("This is May");
			break;
		case 6:
			System.out.println("This is June");
			break;
		case 7:
			System.out.println("This is July");
			break;
		case 8:
			System.out.println("This is August");
			break;
		case 9:
			System.out.println("This is Sept");
			break;
		case 10:
			System.out.println("This is Oct");
			break;
		case 11:
			System.out.println("This is Nov");
			break;
		case 12:
			System.out.println("This is Dec");
			break;
		default:
			System.out.println("This is new month");
			break;
		}
	}
}
