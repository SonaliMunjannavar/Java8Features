package com.tcs.features;

import java.util.function.Supplier;

public class SupplierEx {
  public static void main(String args[]) {
	  Supplier<Integer> SF = ()->{
		  return 11;
	  };
	  System.out.println(SF.get());//11
	  
  }
}
