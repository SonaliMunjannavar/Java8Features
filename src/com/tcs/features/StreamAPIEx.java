package com.tcs.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPIEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> li = new ArrayList<String>();
      
      li.add("Sonali");
      li.add("Pavan");
      li.add("Shrinivas");
      li.add("Ganesh");
      li.add("Samta");
      li.add("Mamta");
      li.add("Gowthami");
      
		/*
		 * for(String obj : li) { System.out.println(obj); }
		 */
	//how to create object: identify the method what it is accepting
     Predicate<String> PR = (t)->{
    	return t.startsWith("S");
     };
      li.stream().filter(PR).forEach(System.out::println);
	}
	/*
	 * 6) Intermediate Operations :
	 * 
	 * map(), filter(), distinct(), sorted(), limit(), skip()
	 * 
	 * Terminal Operations :
	 * 
	 * forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(),
	 * allMatch(), noneMatch(), findFirst(), findAny()
	 */
}
