package app.core;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*
* The Calculator class provides logic for arithmetic operations
* idk will it work with int AND double or only double
*/

public class Calculator{
	// Todo fix divide by 0
	final Logger logger = LoggerFactory.getLogger(Calculator.class);
	
	
	private int result=0;
	
	public int add(final int ... parameters){
		for(Integer param : parameters){
			this.result += param;
		}
		return result;
	}
	
	public int sub( final int... parameters){
			int localResult=parameters[0];
			for (Integer param : parameters){
			parameters[0]-= param;
		}			
		this.result= parameters[0];
		
		return result;
	}
	
	public int mult(final int ... parameters){
		int localResult =1;					
		for(Integer param : parameters){
			// если результат пустой 
			localResult *= param;
		}
		this.result = localResult;
		return result;
	}
	
	public int div(final int ... parameters){
		
		int localResult = parameters[0];
		
		for(Integer param : parameters){
			if(param == 0 ){
				throw new IllegalArgumentException("One of the parameters is '0' .");
			}else{	
			localResult=parameters[0]/parameters[1];
			}
		}
		
		this.result =localResult;
		
		return result;	
	}
	
	public int getResult(){
		return this.result;
	}
	
}