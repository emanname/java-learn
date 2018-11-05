package app.core;

import app.core.Calculator;
import java.util.Scanner;

public class ConsoleScanner {
	
	Scanner scanner;
	Calculator calculator;
	
	public ConsoleScanner() {
		
	}
		
	public void run () {
		
		String operation = "+";
		String exitCond = "no";
		
		scanner = new Scanner(System.in);
		calculator = new Calculator();
		
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
						break;
					}default:break;
			}
			
			System.out.println("Exit?");
			exitCond=scanner.next();
		}
		
		scanner.close();	
	}
	
	
	
}
