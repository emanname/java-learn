package my.test;
public class Calculator{
	
	private int result;
	
	public int add(int ... parameters){
		for(Integer param : parameters){
			this.result+= param;
		}
		return result;
	}
	
	public int getResult(){
		return this.result;
	}
	
}