package com.tcs.features;

@FunctionalInterface
interface Operations {
	void divide(int a, int b);
}


public class MethodRefEx {
     public static void sample(int n, int m) {
    	 System.out.println(n / m);
     }
     public static void test(int n, int m) {
    	 System.out.println(n * m);
     }
     public void general(int p, int q) {
    	 System.out.println(p+q);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * we cannot create object for Operations and no need to create object for
		 * static methods class.Method name instead of creating object
		 *  Method references has 2 types static ,non static
		 */
		MethodRefEx.sample(10,2);
		MethodRefEx.test(2,2);
		//method 
		Operations OP = MethodRefEx :: sample;
		OP.divide(456,2);
		
		Operations OP1 = MethodRefEx :: test;
		OP1.divide(2, 2);
		
		MethodRefEx GE = new MethodRefEx();
		GE.general(234, 3);
		
		Operations OP2 =  GE::general;//for non static give object name.method name
		OP2.divide(1,2);
			
	}

}
