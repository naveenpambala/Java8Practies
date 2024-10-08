package com.java8;

public class LamdaPract {

	public static void main(String[] args) {
		
		//lamda experience only only using for implementing the functional interface 
		 
		//Anonymous Inner class
		//You can create an anonymous inner class that implements the interface and instantiate it on the spot.
		Code c = new Code() {

			@Override
			public void drive() {
				System.out.println("this is second");
			}
	 
			  
		  };
		  
		  //Lambda Expressions
		 //If the interface is functional (i.e., has a single abstract method), you can use a lambda expression to implement it. 
		 //(arguments)-> { function body }
		  Code c1 =()->{
				 System.out.println("This is Third"); 
				
		  };
		  c1.drive();
		  
		 
	 
		 
	}

}

class JavaCode implements Code{

	@Override
	public void drive() {
	
		System.out.println("This is First");
		
	}
	
}

@FunctionalInterface
interface Code{
	public void drive();
	
}
