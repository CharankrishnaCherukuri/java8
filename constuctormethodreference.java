package com.bct.java8gfeautres.methodreferences;
interface constructorInterface{
	Hello display(String say);
	
}
class Hello{
	//constructor
	 Hello(String say) {
		System.out.println("good morning guys..."+ say);
		
	}
}

public class constuctormethodreference {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		constructorInterface ref=Hello::new;
		ref.display("how are you doing.....!");

	}

}
