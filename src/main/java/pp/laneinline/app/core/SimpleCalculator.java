package core;
/*
 * That is just stub class so i can move further
 * it works only with two arguments  and only with ints
 * 
 * 
 * */
import java.lang.Math;


public class SimpleCalculator {

	
	public int add(int a,int b) {
		a +=b;
		return a;
	}
	public int sub(int a,int b) {
		a -=b;
		return a;
	}
	public int mult(int a,int b) {
		a *=b;
		return a;
	}
	public int div(int a,int b) {
		a /=b;
		return a;
	}
	
	public int pow(int a, int b) {
		a =  (int) Math.pow(a,b);
		return a;
	}
	
	
	
	
	
	
}
