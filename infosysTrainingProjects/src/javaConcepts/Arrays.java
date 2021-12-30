package javaConcepts;

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
