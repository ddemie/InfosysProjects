package javaConcepts;

public class MethodOverloading {
  public static class Tester {

	public static void main(String[] args) {



		Customer regCust = new RegularCustomer();
	
		System.out.println("Final Bill : " + regCust.payBill(40.0)); 
	}
}

public static class Customer {

	public double payBill(double totalPrice) {
		System.out.println("Final bill for the customer is calculated here");
		return totalPrice;
	}
}

public static class RegularCustomer extends Customer {

	@Override
	public double payBill(double totalPrice) {
		System.out.println("Final bill for the regular customer is calculated here");
		double priceAfterDiscount = totalPrice * (1 - (5f / 100));
		return priceAfterDiscount;
	}

}

}
