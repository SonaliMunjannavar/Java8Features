package com.tcs.features;

import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Function<Integer, String> FN =(t) -> {
        	   return "CUP";
           };
           System.out.println(FN.apply(10));
           Function<Integer, Integer> functionObject = (t) -> {
       		return t+20;//sum
       	};
       	
       	System.out.println(functionObject.apply(10));
	}
	

}
