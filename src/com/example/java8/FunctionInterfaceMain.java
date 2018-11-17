/**
 * 
 */
package com.example.java8;

/**
 * @author tushar
 *
 */
public class FunctionInterfaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
/*		int a = 5;
		int b = 6;
		
		FunctionalInterfaceTest fTest = (m,n) -> (m*n);
		
		int result = fTest.add(a,b);
		System.out.println(result);*/
		
		
/*		FunctionInterface1<Integer, Integer> test = (n,m) -> n*m;
		
		System.out.println(test.testFunction(10,3));*/
		
		
		BiFunctionInterface<Integer, String, Integer> bInterface = (n,m) -> n+Integer.parseInt(m);
		System.out.println(bInterface.testFunction(10,"5"));

	}

}
