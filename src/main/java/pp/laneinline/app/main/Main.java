package main;



import app.core.ConsoleScanner;;

//TODO 	1. move scanner out of main to new class
//		2. allow user to chose arithmetic operations  

public class Main{

	
	public static void main(String[] args){
		ConsoleScanner consoleScanner = new ConsoleScanner();
		consoleScanner.run();
	}

}