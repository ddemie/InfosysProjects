package swiftFoodApp;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		Set<String> food = new LinkedHashSet<String>(); // Creating LinkedHashSet object
		food.add("Pasta"); // Adding elements to the LinkedHashSet
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("The duplicates are removed and displayed in the order in which the elements are inserted: ");
		System.out.println(food);
	}
}