package com.tcs.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamAPIME {

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
	      li.add("Gowthami");
	      
	      
	      Function<String, String> MP = (name)->{
	    	  return name.toUpperCase();
	      };
	     // li.stream().map(MP).forEach(System.out::println);
	
	      Predicate<String> FR =(t)->{
	    	  return t.endsWith("a");
	      };
	    //  li.stream().filter(FR).forEach(System.out::println);

	     // li.stream().distinct().forEach(System.out::println);
	      //distinct method is use to retrive unique value
	    
	      //li.stream().sorted().forEach(System.out::println);
	     // li.stream().limit(3).forEach(System.out::println);
	    //  li.stream().skip(4).forEach(System.out::println);
	      
			/*
			 * Object[] obj=li.stream().sorted().toArray();//object [] gives be fully
			 * qualified address System.out.println(Arrays.toString(obj));//if u print array
			 * ref it will give fully qualified address
			 */
	    li.stream().sorted().collect(null);
	}

}
