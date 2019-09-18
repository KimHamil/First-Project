import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		public static void main(String[] args) {
			IterationMathLib iterationLibrary = 
					new IterationMathLib();
			RecursiveMathLib recursionLibrary=
					new RecursiveMathLib();
			
			System.out.println("--- Iteration ---");
			runTestCode(iterationLibrary);
			System.out.println("--- Recursion ---");
			runTestCode(recursionLibrary);
		}
		public static void runTestCode(MathLib Library) {
			System.out.println("GCD(4,2) = "+Library.gcd(4, 2));
			System.out.println("ack(10,5) = "+Library.ack(10, 5));
			System.out.println("fib(9) = "+Library.fib(9));
			System.out.println("hanoi(2) = "+Library.hanoi(2));
		}
	}

}
