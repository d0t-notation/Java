import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("\nEnter the desired element for the fibonnaci sequence: ");
		int fib = scan.nextInt();

		int sequence = fibonacci(fib);

		System.out.println("\nfibonacci(" + fib + ") returned: " + sequence + "\n");
	}




	public static int fibonacci(int n)  {
    	if (n <= 1)
      return n;
   	  return fibonacci(n-1) + fibonacci(n-2);
	}
}	