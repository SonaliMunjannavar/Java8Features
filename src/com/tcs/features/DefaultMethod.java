package com.tcs.features;

public interface DefaultMethod {
	/*
	 * in interface it allows static methods from Java8 it allows default methods as
	 * well
	 * before j8 it didnt allow static method and defaults method in interface ,it use to throw error
	 * You can write n number of any methods
	 */
	static void sample(){
		System.out.println("Static Method");
	}
	
	default void defaultMethod(){
	System.out.println("Default Method");
	}
	
	abstract void abstractMethodsample();
}
