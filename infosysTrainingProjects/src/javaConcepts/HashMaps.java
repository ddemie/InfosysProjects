package javaConcepts;

public class HashMaps {

	public static void main(String args[]) {
	Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	
	hashMap.put(101, 6);
	hashMap.put(102, 8);
	hashMap.put(103, 10);
	hashMap.put(102, 5);
	
	hashMap.replace(102, 8, 15);
	System.out.println(hashMap);
}
}
