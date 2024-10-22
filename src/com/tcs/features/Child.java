package com.tcs.features;

interface Parent{
    void parentName();
}

public class Child implements Parent{
	/*
	 * you have to declare public their should be only one access modifier public
	 * which should be for main method file name should be of main method class name
	 */
	public void parentName() {
		System.out.println("Parent Name ");
	}
	public static void main(String args[]) {
	     Parent PK = new Child();//storing sub class object into super class reference Child is sub class,parent is super class
	     PK.parentName();
	     // this is know as abstraction
	     
	     //abstraction = hiding implentation and showing method declaration
	     //abstract method = which doesn't have body
	     //abstract class = it allows both normal methods and abstract methods
	}

}

