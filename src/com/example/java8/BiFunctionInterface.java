/**
 * 
 */
package com.example.java8;

/**
 * @author tushar
 *
 */
@FunctionalInterface
public interface BiFunctionInterface<A, B, C> {
	
	C testFunction(A a, B b);

}
