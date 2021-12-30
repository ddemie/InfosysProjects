package javaConcepts;
import java.util.List;
import java.util.LinkedList;

public class LinkedLists {

	public static class EuropeTrip {

	public static void main(String args[]) {

		List<String> cities = new LinkedList<String>();

		cities.add("Milan");
		cities.add("Venice");
		cities.add("Munich");
		cities.add("Vienna");

		System.out.println(cities);


		cities.add(3, "Prague");
		System.out.println(cities);

		cities.remove("Munich");
		System.out.println(cities);

		cities.set(2, "Berlin");
		System.out.println(cities);

		System.out.println(cities.size());

		System.out.println(cities.contains("Paris"));

		System.out.println(cities.get(0));

		cities.clear();
		System.out.println(cities);

	}
}

}
