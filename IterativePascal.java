import java.util.Arrays;

public class IterativePascal extends ErrorPascal  {
	//Class for Pascal's Triangle. Calculates and prints the first n lines of Pascal's Triangle, using a two-dimensional array.
	boolean UpsideDown = false; //if set to 'true', the triangle will be decrementing (upside down)
	
	public void printPascal (int n) throws Exception{
		int[] input = {n};
		SanityCheck(input);
		//Calculates and prints first n lines of Pascal's Triangle
		int[][] Triangle = new int[n][n];
		
		//nested for-loop fills all slots of two-dimensional array
		for (int i = 0; i < n; i++) for (int j = 0; j <= i; j++) Triangle[i][j] = binom(i,j);
		
		//for-loop that prints incrementing triangle if UpsideDown == False
		if ( UpsideDown == false) for (int[] Line : Triangle) System.out.println(Arrays.toString(Line)); 
		
		//for-loop prints that decrementing triangle if UpsideDown == True
		else for (int i = n-1; i >= 0; i--) System.out.println(Arrays.toString(Triangle[i])); 
	}
	
	public int binom (int n, int k) throws Exception{
		//Calculates binomials
		int[] input = {n,k};
		SanityCheck(input);
		int Output = 1;
		for (int i = 1; i <= k; i++) Output = Output*(n+1-i)/i;	
		
		return Output;
	}
	
	public void SetUpsideDown (boolean bool) {this.UpsideDown = bool;} 
	//Sets UpSideDown to desired value	
}