package javaConcepts;

import java.util.HashSet;
import java.util.Set;

/*

Set can contain only unique elements and size() method is used to get the number of elements present in the HashSet.

At line 6, element 20 is added. Size=1

At line 7, element 50 is added. Size =2

At line 8, again element 20 is added. Since the element is not unique, Size = 2

At line 10, element 20 is removed. Size =1

At line 12, element 50 is added. Since the element is not unique, Size=1

*/

public class HashSets {
  public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(20);
		set.add(50);
		set.add(20);
		System.out.print(set.size() + " ");
		set.remove(20);
		System.out.print(set.size() + " ");
		set.add(50);
		System.out.print(set.size() + " ");
	}
}
