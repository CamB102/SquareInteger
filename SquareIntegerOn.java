package algorithmday1;

public class SquareIntegerOn {

	public static void main(String[] args) {
		int a = 28;
		int b = 56;

		int count = numberOfSquareInteger(a, b);
		System.out.println("Number of square integers between " 
		+ a + " and " + b + ": " + count);
		
		System.out.println("O(n)");
				
		
	}

	public static int numberOfSquareInteger(int a, int b) {
		int count = 0;

		int squareRoot = (int) Math.sqrt(a); 
		
		while (squareRoot * squareRoot <= b) {
			if (squareRoot * squareRoot >= a) {
				count++;
				System.out.println(squareRoot);
			}
			squareRoot++;
		}

		return count;
	}
}
