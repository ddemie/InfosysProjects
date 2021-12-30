package swiftFoodApp;

public class Order {
	private int orderCounte;
	private int orderId;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;
	
	public int getOrderCounte() {
		return orderCounte;
	}
	public void setOrderCounte(int orderCounte) {
		this.orderCounte = orderCounte;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order() {
		
	}
	public Order(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	
	public double calculateTotalPrice(String paymentMode) {
		return 10.0;
	}

}