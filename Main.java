import java.util.Scanner;

import my.test.*;


public class Main{

	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		String exitCond = "no";
			
			while(!exitCond.equals("exit") ){
				System.out.println("Enter first argument: ");
				String first =scanner.next();
				System.out.println("Enter first argument: ");
				String second =scanner.next();
				System.out.println("Sum: " + 
					calculator.add(Integer.valueOf(first), Integer.valueOf(second)) );
				
				System.out.println("Exit?");
				exitCond=scanner.next();
			}
		scanner.close();	
			
		
	}

}