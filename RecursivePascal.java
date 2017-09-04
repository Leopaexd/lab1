import java.util.ArrayList;

public class RecursivePascal { 
	//Class for Pascal's Triangle
	boolean UpsideDown = false;
	
	public void printPascal(int n){
		//Prints line n of Pascal's Triangle and makes a recursive call to print line n-1
		String Line = new String();
		if (UpsideDown == false){ //Prints incrementing triangle
		if (n > 0){
			printPascal(n-1);
		}
		for (int i = 0; i <= n; i++){
			Line += (binom (n,i)+" "); //Appends the line string with each number
		}
		System.out.println(Line);
		}
		else { //Prints decrementing triangle	
		}
	}
	
	public int binom(int n, int k){
		//Calculates binomials
		if (k == n || k == 0) return 1;
		return (binom(n-1,k-1) + binom (n-1,k));
		}
}
