
public class Driver {
	public static void main(String[] args) throws Exception {
		//RecursivePascal triangle = new RecursivePascal();
		IterativePascal triangle = new IterativePascal();
		triangle.SetUpsideDown(false);
		triangle.printPascal(5);
		triangle.binom(3, 2);
	}

}
