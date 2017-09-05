import java.util.Arrays;

public class IterativePascal implements Pascal{
	public void printPascal (int n) {
		//Calculates and prints first n lines of Pascal's Triangle
		int[][] Triangle = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				Triangle[i][j] = binom(i,j);
			}
		}
		for (int[] Line : Triangle) {
			System.out.println(Arrays.toString(Line));
		}
	}
	
	public int binom (int n, int k) {
		//Calculates binomials
		int Output = 1;
		for (int i = 1; i <= k; i++) {
			Output = Output*(n+1-i)/i;
		}	
		return Output;
	}
}
