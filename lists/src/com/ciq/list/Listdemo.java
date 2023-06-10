package com.ciq.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listdemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		System.out.println(list.size());
		list.add(1);
		list.add(3);
//		list.add(2, "arg1");
//		list.add(3.0);
//		list.add(4.0);
//		list.add(null);
		System.out.println("is empty?: "+list.isEmpty());
		System.out.println(list);
		System.out.println("contains: "+list.contains(2));
	System.out.println("....iterating elements using for each....");
		for (Object object : list) {
			System.out.println(object);
		}
	System.out.println(".....Get and Set Element in List......");
	    System.out.println("getting an element: "+ list.get(1));
	//System.out.println("setting an element: "+list.set(2,"sahithi"));
	    System.out.println(list);
	System.out.println(".....sorting....");
	    list.add(2);
	    list.add(4);
	    list.add(2);
	    System.out.println(list);
	    Collections.sort(list);
	    
	    for (Integer integer : list) {
			System.out.print(integer);
		}
	    System.out.println("\n"+list);
	    System.out.println(list.indexOf(3));
	    System.out.println(list.lastIndexOf(2));
	    System.out.println(list.remove(2));
	    System.out.println(list);
	    System.out.println(list.get(3));
	    List li=new ArrayList();
	   li.add(1);
	   li.add(2);
	   li.add(3);
	   li.add(4);
	    System.out.println(list.equals(li));
	   System.out.println(li);
	    li.clear();
	    System.out.println("clear"+li);
	}
}
