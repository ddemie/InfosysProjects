package swiftFoodApp;

public class Address {
	private String doorNo;
	private String streetNo;
	private String city;
	private int zipCode;
	
	public Address(String doorNo, String streetNo, String city, int zipCode) {
		this.doorNo = doorNo;
		this.streetNo = streetNo;
		this.city = city;
		this.zipCode = zipCode;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
