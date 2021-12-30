package javaConcepts;

class ArrayDotProduct {

	private static void dotProduct(int[] a, int[] b) {
		      
		if(a.length == 0 || b.length == 0){
            System.out.println("Array size cant be zero");
        }else if (a.length != b.length){
            System.out.println("Arrays must be of same size");
        } 
		
		int finalNum = 0;
		
		for(int i = 0; i < a.length; i++) {
			int[] thisNum = {a[i] * b[i]};
			
			for(int num: thisNum) {
				
				finalNum += num;
				
			}
		}
		
		System.out.println(finalNum);
	
   }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,4,7};
        
        dotProduct(a,b);
    }

}