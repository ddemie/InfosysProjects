package javaConcepts;

import java.util.ArrayList;
import java.util.List;

//Four elements are added to the list. When a new element is inserted at a specified position, the element currently at that position gets shifted to the right.
public class ArrayLists {
  public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Pizza");
		list.add(0, "Burger");
		list.add(0, "Sandwich");
		list.add(0, "Noodles");
		System.out.println(list.size());
	}

} 
