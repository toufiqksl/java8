/**
 * 
 */
package com.example.java8;

import java.util.*;
import java.util.function.Predicate; 


/**
 * @author tushar
 *
 */
public class PredicateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = 
	            Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2"); 
	  
	        // declare the predicate type as string and use 
	        // lambda expression to create object 
	        Predicate<String> p = (s)->s.startsWith("G"); 
	  
	        // Iterate through the list 
	        for (String st:names) 
	        { 
	            // call the test method 
	            if (p.test(st)) 
	                System.out.println(st); 
	        } 
	}

}
