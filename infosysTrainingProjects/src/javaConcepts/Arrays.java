package javaConcepts;

/*
Calculate and return the sum of all the even numbers present in the numbers array passed to the method calculateSumOfEvenNumbers. 
Implement the logic inside calculateSumOfEvenNumbers() method.

Test the functionalities using the main() method of the Tester class.
*/

public class Arrays {
   public static int calculateSumOfEvenNumbers(int[] numbers){
        int sum = 0;
        for(int nums : numbers){
            if(nums % 2==0){
                sum += nums;
            }
        }
        return sum;
    }
    
	public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
	}

}
