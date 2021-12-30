package javaConcepts;

/*

Since, Error class is a child class of Throwable class, 
the corresponding catch block of Throwable will handle the exception and C is displayed. 
Then, finally block is executed and after that E is displayed.

*/

public class Exceptions {
  public static void main(String[] args) {
		try {
			method1();
			System.out.print("A");
		} catch (Exception e) {
			System.out.print("B");
		} catch (Throwable e) {
			System.out.print("C");
		} finally {
			System.out.print("D");
		}
		System.out.println("E");
	}

	public static void method1() {
		throw new Error();
	}

}
