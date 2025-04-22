package com.tcs.features;
import java.util.*;
import java.util.function.Consumer;
public class ConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Consumer<String> CN = (t)->{
            	System.out.println(t);
            };
            CN.accept("Munjannavar");
	}

}
