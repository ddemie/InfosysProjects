package javaConcepts;

public class Strings {
public static class Tester{
    public static boolean checkPalindrome(String str){
		
		char[] letters = new char[str.length()];
		
		int letterIndex = 0;
    	
    	int lettersIndex= 0;
    	
	   for(int i = str.length() - 1; i >= 0; i-- ) {
		  letters[letterIndex] = str.charAt(i);
		  letterIndex++;
	   }
		
		String reverse = "";
		for(int i = 0; i < str.length(); i++) {
			reverse = reverse + letters[i];
		}
		
		boolean palendrome = false;
		if(reverse.equals(str)) {
			palendrome = true;
		}
		
        return palendrome;
    }
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
}
