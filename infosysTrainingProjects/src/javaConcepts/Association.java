package javaConcepts;

/*
You need to develop an application for cab service providers by implementing the classes based on the class diagram and description given below.

Method Description

CabServiceProvider

CabServiceProvider(String cabServiceName, int totalCabs)

Initialize all the instance variables appropriately with the values passed to the constructor.
calculateRewardPrice(Driver driver)

Calculate and return the bonus of the driver based on the below table. If averageRating of the driver is less than 4, return the bonus as 0.   


In case of any invalid value, return the bonus as 0. 
Note: Round off the bonus to 2 decimal digits.

Implement the appropriate getter and setter methods.

Perform case-sensitive comparison wherever applicable.

Test the functionalities using the provided Tester class. 
*/

public class Association {   
    public static class CabServiceProvider {
	private String cabServiceName;
	private int totalCabs;
	
	public CabServiceProvider(String cabServiceName, int totalCabs) {
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
		
		System.out.println("Cab Service: "+cabServiceName);
		System.out.println("total number of Cabs " + totalCabs);
		System.out.println("---------------------");
	}
	
	public double calculateRewardPrice(Driver driver) {
		driver.getAverageRating();
		
		if(cabServiceName == "Aber") {
			if(driver.getAverageRating() >= 4.5 && driver.getAverageRating() <=5) {
				return driver.getAverageRating() * 8;
			}
			else if(driver.getAverageRating() >= 4 && driver.getAverageRating()<= 4.5) {
				return driver.getAverageRating() * 3;
			}
			else {
				return 0;
			}
		}
		if(cabServiceName == "Halo") {
		if(driver.getAverageRating() >= 4.5 && driver.getAverageRating() <=5) {
			return driver.getAverageRating() * 10;
		}
		else if(driver.getAverageRating() >= 4 && driver.getAverageRating()<= 4.5) {
			return driver.getAverageRating() * 5;
		}
		else {
			return 0;
		}
	}
		return driver.getAverageRating();
		}
	

	public String getCabServiceName() {
		return cabServiceName;
	}

	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}

	public int getTotalCabs() {
		return totalCabs;
	}

	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	

}

public static class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

public static class Tester {
	
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = Math.round(cabServiceProvider1.calculateRewardPrice(driver)*100)/100;
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		System.out.println("------------------------------------------------");
		
		CabServiceProvider cabServiceProvider2 = new CabServiceProvider("Aber", 45);
		
		
		Driver driver4 = new Driver("Luke", 4.9f);
		Driver driver5 = new Driver("Tom", 4.6f);
		Driver driver6 = new Driver("David", 4.4f);
		Driver driver7 = new Driver("John", 4.85f);
		Driver driver8 = new Driver("Selvester", 5.0f);
		Driver driver9 = new Driver ("Luke", 4.9f);
		
		Driver[] driversList1 = { driver4, driver5, driver6, driver7, driver8, driver9};
		for (Driver driver : driversList1) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = Math.round(cabServiceProvider2.calculateRewardPrice(driver) *100)/100;
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		//Create more objects of CabServiceProvider and Driver classes for testing your code
	}
}

  

}
