package GuviJavaTask;

public class Task8_6_PrintFactorial {

	public static void main(String[] args) {

		int num = 5; // The number for which we want to find factorial
		long factorial = 1; // The variable to store the result
		for (int i = 1; i <= num; i++) { 
			factorial = factorial * i; 
		}
		System.out.println("Factorial of " + num + " is: " + factorial); 
	}
}
