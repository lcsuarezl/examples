package com.java.examples.operators;

public class OperatorsExamples {
	
	
	public static void main(String[] args){
		operatorsExamples();
	}
	    
	private static void operatorsExamples(){
		double firsthDouble= 20d;
		double secondDouble= 80d;
		
		double result = (firsthDouble+secondDouble)*25;
		int remain = (int) (result%40);
		
		if(remain <=20)
			System.out.println("Total was over the limit");
		
		
		
	}

}
