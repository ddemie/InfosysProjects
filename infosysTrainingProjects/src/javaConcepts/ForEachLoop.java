package javaConcepts;

public class ForEachLoop {
public static class Tester {
    
    public static double[] findDetails(double[] salary) {
       double averageSalary = 0;
       double lesser = 0;
       double greater = 0;
       for(double sal: salary) {
    	   averageSalary += sal/salary.length;
       }
       
       
       for(double greaterThanSal: salary) {
    	   if(greaterThanSal > averageSalary) {
    		   greater++;
    	   }
       }
       for(double lessThanSal : salary) {
    	   if(lessThanSal < averageSalary) {
    		   lesser++;
    	   }
       }
       
       
       
       double finalNumbers[] = {averageSalary, greater, lesser};
        
        return finalNumbers;     

    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}


}
