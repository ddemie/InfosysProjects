package javaConcepts;

public class Methods {
  public static class Calculator {

	public double averageMethod(double a, double b, double c){
	    double addedNumbers =  a+b+c;
	    double dividedNumber = 3.0;
	    double finalMethod = addedNumbers/dividedNumber;
	    return finalMethod;
	}
}

public static class Tester {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.averageMethod(10, 20, 30));
	}
}

}
