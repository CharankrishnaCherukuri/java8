package com.bct.java8gfeautres.methodreferences;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] StringArray= {"charan","ganguly","vupendra","srikar","konanki yugandhar"};
		
		Arrays.sort(StringArray,String::comparetoIgnorecase);

	}

}
