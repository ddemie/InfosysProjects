package javaConcepts;

//Below program shows how to add and simplify fractions in java


public class Fractions {
	public static void main(String[] args) {
		int n1 = 5;
		
		int d1 = 10;
		
		int n2 = 15;
		
		int d2 = 20;
		
		int finalD;
		
		int finalN;
		
		if(d1 == d2) {
			finalN = n1 + n2;
			finalD = d1;
		}else {
			finalD = d1 * d2;
		finalN = (n1 * d2) + (n2 * d1);
		}
	
		simpFrac(finalN, finalD);
		
	}
	
	public static void simpFrac(int num, int den) {
		int divisor = 0;
		
		System.out.println("Fractions added and before simplified: " + num + " /" + den);
		
		for(int i = num; i >= 1; i --) {
			if(num % i == 0 && den % i == 0) {
				divisor = i;
				break;
			}
		}
		
		if(divisor != 0) {
			num /= divisor;
			den /= divisor;
		}
		System.out.println("Fracion after simplified: " + num + " / " + den);
	}
}
