package com.tcs.features;

@FunctionalInterface
interface Mous{
	void cup();
}
public class AnoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //To avoid the creation of multiple class to override we use anonymous class
		Mous MF = new Mous() {
			@Override
			public void cup() {
				System.out.println("Cup of coffee");
			}
		};
    	   MF.cup();
		
	}

}
