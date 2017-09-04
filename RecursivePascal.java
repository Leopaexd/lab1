import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RecursivePascal { 
	//Class for Pascal's Triangle. Calculates and prints the first n lines of Pascal's Triangle, using a two-dimensional array.
	boolean UpsideDown = false; //if set to 'true', the triangle will be decrementing (upside down)
	ArrayList<int[]> Triangle = new ArrayList<int[]>(); 
	
	public void printPascal(int n){
		//Calculates and prints the first n lines of Pascal's Triangle
		int[] Line = new int[n+1];
		for (int i = 0; i <= n/2; i++){
			Line[i] = (binom (n,i));
			Line[n-i] = Line[i];
		}
		Triangle.add(Line);
		if (n > 0){
			printPascal(n-1);
		} else {
			if (UpsideDown == false) { //incrementing triangle
				Collections.reverse(Triangle);
			}
			for (int[] s : Triangle) {
			System.out.println(Arrays.toString(s));
			}
		}
	}
	
	public int binom(int n, int k){
		//Calculates binomials
		if (k == n || k == 0) return 1;
		return (binom(n-1,k-1) + binom (n-1,k));
		}
	
	public void SetUpsideDown (boolean bool) {
		//Sets UpSideDown to desired value
		this.UpsideDown = bool;
	}
}
