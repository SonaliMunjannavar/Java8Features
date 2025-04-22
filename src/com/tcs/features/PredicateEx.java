package com.tcs.features;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Predicate<String> PR = (t)->{
	  return true;
  };
  
  System.out.println(PR.test("Munjannavar"));
	}

}
