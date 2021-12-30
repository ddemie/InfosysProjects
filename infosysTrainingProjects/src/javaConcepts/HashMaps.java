package javaConcepts;

/* There is no entry where key is 102 with the corresponding value as 8. The value 8 is replaced by 5 for the key 102. 
Therefore the final output will be {101=6, 102=5, 103=10}*/

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
