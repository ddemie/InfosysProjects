/*

Consider the example of customer paying the bill for an order. 
Here, payBill method accepts totalPrice and discount as parameters and calculates the final price to be paid by the customer. 

When we invoke the payBill() using a Customer object, we don’t have to know the internal working of the method to invoke it. 
This ability to use something without having to know the details of how it is working is called as abstraction.

*/



public class AbstractionInJava {
public static class Customer {
	String customerName;

	public void payBill(double totalPrice, double discount) {
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discount / 100));
		System.out.println("Hi " + customerName
				+ ", your final bill amount after discount is "
				+ (int) (priceAfterDiscount * 100) / 100.0);
	}

}

public static class Tester {
	public static void main(String args[]) {
		Customer customer = new Customer();
		customer.customerName = "Jack";
		customer.payBill(500, 5);
	}
}
}
