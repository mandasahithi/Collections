package com.ciq.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;

public class Arratlistdemo{
int minCapacity;
	public static void main(String[] args) {
ArrayList<Object> arr=new ArrayList<>();
System.out.println("initial size: "+ arr.size());
							arr.add(1);
  arr.add(1, "element");
  arr.add(1.0);
  arr.add("true");
  arr.add(null);
  arr.add("element");
  System.out.println("arr: "+arr);
  ArrayList<Integer> arr1=new ArrayList<>(1);
  arr1.add(1);
  arr1.add(3);
  arr1.add(2);
  System.out.println("arr1: "+arr1);
  arr.addAll(arr1); 
  System.out.println("added arr1 to arr: "+ arr);
  System.out.println("......sublist.....");
  							System.out.println(arr.subList(0, 3));
  							System.out.println("equals "+ arr1.equals(arr));
  System.out.println(arr1);
  System.out.println(arr1.get(2));//getting 2nd index 
  System.out.println(arr1.indexOf(2));//getting index of 2.
  System.out.println(arr);
  							System.out.println(arr.lastIndexOf(1));
  							System.out.println(arr.remove(1.0));
  							System.out.println(arr.isEmpty());
  System.out.println(arr);
  							System.out.println(arr.set(6,"false"));
  System.out.println("set 6th element with false"+arr);
  System.out.println("....iterator......");
  							Iterator<Object> iter=arr.iterator();
  							while (iter.hasNext()) {
  								System.out.println(iter.next());
  							}
  							
 System.out.println("....reverse.....");
 System.out.println(arr1);
	Collections.reverse(arr1);
System.out.println(arr1);
System.out.println("...sorting...");
							Collections.sort(arr1);
							System.out.println(arr1);			
System.out.println(arr1.contains(1));
System.out.println(arr.containsAll(arr1));
System.out.println(arr1);
System.out.println("....remove if n>=2.....");
arr1.removeIf(n ->(n>=2));
System.out.println(arr1);
arr1.add(11);
arr1.add(123);
System.out.println(arr1);
System.out.println("......replace all elements*2....");
arr1.replaceAll(n ->n*2);
System.out.println(arr1);
Collections.replaceAll(arr1, 22, 33);
System.out.println("replace 22 with 33 "+arr1);


  
  
  
  
  
}}
