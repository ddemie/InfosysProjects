package javaConcepts;

/*

A nested loop is a loop within another loop, an inner loop within the body of an outer one.

Let us print the following pattern:

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 9 10 

We can create the above pattern using the nested loop.

*/

public class ForLoops {

	public static class Numbers {
	public static void main(String[] args) {
		int rows = 10;
		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " "); 
			}
			System.out.println(""); 
		}
	}
}


}
