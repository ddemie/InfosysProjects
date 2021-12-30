/*
below code represents interface

An interface is used to define a generic template which can be implemented by various classes.
*/

Interface Interfaces {
  int number = 5;
}
interface Demo extends Interfaces{
	void display();
}

class DemoClassOne implements Demo {
	public void display() {
		System.out.println(number);
	}
}

class Tester {
	public static void main(String[] args) {
		Demo obj = new DemoClassOne();
		obj.display();
	}
}
