package com.tcs.features;

interface Test {
	void multiply(int a, int b);
}

public class LambdaExpressionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceSample refN = () -> {
			System.out.println("Print refName");
		};
		refN.sum();// Print refName coming from Lambda expression Body
		Test NM = (x, y) -> {
			System.out.println(x * y);
		};
		NM.multiply(2, 7);// 14
		
		/* syntax ()->{} for Lambda expression
		 we are using J8 features to avoid the huge memory usage by creating child class for parent interface*/
	}
}
