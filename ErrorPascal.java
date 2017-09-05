
public abstract class ErrorPascal implements Pascal{
	//Abstract class for Pascal's Triangle, handles errors.
	
	public void printPascal(int n) throws Exception{
		//Calculates and prints the first n lines of Pascal's Triangle
	}
	public int binom(int n, int k) throws Exception{
		//Calculates and returns the binomial coefficient for n choose k
		return 1;
	}
	
	public void SanityCheck(int[] input) throws Exception{
		//Handles basic sanity checking for input numbers
		int n = input[0];
		int k = 1;
		if (input.length > 1) k = input[1];
		if (n < 0) throw new Exception ("n must be a positive integer");
		if (k < 0 | k > n) throw new Exception ("k must be a positive integer no larger than n");	
	}
}
