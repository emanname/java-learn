import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import my.test.*;

//TODO 	1. move scanner out of main to new class
//		2. allow user to chose arithmetic operations  

public class Main{

	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		String operation = "+";
		String exitCond = "no";
		Date currentTime = Calendar.getInstance().getTime();
		
		System.out.println(currentTime);

		
			while(!exitCond.equals("exit") ){
				System.out.println("Enter first argument: ");
				String first =scanner.next();
				System.out.println("Chose operation + - * / :");
				operation = scanner.next();
				System.out.println("Enter second argument: ");
				String second =scanner.next();

				switch(operation){
					 case "+":{
						 System.out.println("Sum: " + calculator.add(Integer.valueOf(first), Integer.valueOf(second)) );
					 }case "-":{
						 System.out.println("Sub: "	+ calculator.sub(Integer.valueOf(first),Integer.valueOf(second)));
					 }case"*":{
						 System.out.println("Mult: "+ calculator.mult(Integer.valueOf(first),Integer.valueOf(second)));
					 }case"/":{
						 System.out.println("Div: "	+ calculator.div(Integer.valueOf(first),Integer.valueOf(second)));
					 }
					
				}
				

					
					
				
				System.out.println("Exit?");
				exitCond=scanner.next();
			}
		scanner.close();	
			
		
	}

}