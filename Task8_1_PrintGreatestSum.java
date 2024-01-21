package GuviTask;

public class Task8_1_PrintGreatestSum {

	public static void main(String[] args) {

		// code to add two integers and print the greatest sum using if condition

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int Sum1 = (a + b);
		int Sum2 = (c + d);

		if (Sum1 > Sum2)
			System.out.println("Sum of a+b is greater than sum of c+d");
		else {
			System.out.println("Sum of c+d is greater than sum of a+b");
		}

	}
}