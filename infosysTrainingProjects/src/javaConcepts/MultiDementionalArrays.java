//Program to illustrate the use of multidimensional array by showing the temperature and the day


package javaConcepts;

public class MultiDementionalArrays {
 
public static class Tester {
	public static void main(String[] args) {

		int[][] dayWiseTemperature = new int[][] { { 29, 21 }, { 24, 23 },
				{ 26, 22 }, { 28, 23 }, { 29, 24 }, { 23, 20 }, { 29, 21 } };

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0)
					System.out.println("Max Temperature is "
							+ dayWiseTemperature[i][j] + " on day " + i);
				else
					System.out.println("Min Temperature is "
							+ dayWiseTemperature[i][j] + " on day " + i);
			}
		}
	}
}

}
