package com.qa.qacommunity;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListexercise {

	public static void main(String[] args) {
//		List <String> rainbowColours = new ArrayList<>();
//	
//	rainbowColours.add("Red");
//	rainbowColours.add("Orange");
//	rainbowColours.add("Green");
//	rainbowColours.add("Blue");
//	rainbowColours.add("Indigo");
	
//	System.out.println(rainbowColours);
	
//	for(String colours : rainbowColours) {
//		System.out.println(colours);
//	}
	
//	for(int i = 0 ; i<rainbowColours.size() ; i++) {
//		System.out.println(rainbowColours.get(i));
//	}
	
//	System.out.println(rainbowColours.get(0));
	
//	rainbowColours.set(0, "Violet");
//	System.out.println(rainbowColours);
	
//	rainbowColours.remove(0);
//	System.out.println(rainbowColours);
	
//	Collections.sort(rainbowColours);
//	System.out.println(rainbowColours);
	
//	Collections.reverse(rainbowColours);
//	System.out.println(rainbowColours);
	
//	Collections.swap(rainbowColours, 0, 3);
//	System.out.println(rainbowColours);
	
	List <String> rainbowColours = new ArrayList (List.of ("Red", "Orange", "Blue"));
		
	System.out.println(rainbowColours);
	Collections.clone(rainbowColours);
	
	
	}
}
	
	
	
