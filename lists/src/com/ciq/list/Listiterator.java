package com.ciq.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//ListIterator Interface is used to traverse the element in a backward and forward direction.
public class Listiterator {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(22);
		li.add(24);
		li.add(17);
		li.add(2);
System.out.println(".......using  iterator from list index-2 to iterate through its elements........");
		 ListIterator<Integer> list=li.listIterator(2);
		 while (list.hasNext()) {
			System.out.println(list.nextIndex()+" "+list.next());	
		}
 System.out.println("..........for each.........");
		 for (Integer integer : li) {
			System.out.println(integer);
		}
System.out.println("........for loop to iterate list and get element by index........");
for (int i = 0; i < li.size(); i++) {
	System.out.println(li.get(i));
}
	}

}
