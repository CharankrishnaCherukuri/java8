package com.bct.java8gfeautres.methodreferences;

import java.util.function.BiFunction;


interface MyInterface{
	//A method ---abstract method
	public void display();
}
// make reference to the abstract method and instance method
/*
 * method reference to static method of the class.
 */
class addition{
	static int add(int numberone,int numbertwo) {
		return numberone+numbertwo;
		
	}
}

public class Student {
	/*method references is the short hand notation of lambda expression to call a method.
     *
     *str->system.out.println(str);
     *
     *
     */
	public void MyMethod() {
		System.out.println("Instance Method");
		System.out.println(" i have been referenced by the object");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an object class
	  Student object=new Student();
       //method reference using the object of the class
	  MyInterface ref=object::MyMethod;
	  // calling the method of functional interface
	  
	  ref.display();
	  //create an object to class addition
	  BiFunction<Integer,Integer,Integer> addition=Addition::add;
      
	  int sum=addition.apply(11, 5);
	  System.out.println("addition of two numbers is:" + sum);
	  
	  // I am commenting here
	  
	}

}
