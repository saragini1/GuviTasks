package GuviJavaTask;

public class Task8_2_CheckEvenOrOdd {

	public static void main(String[] args) {

		// code to check if the number is even or odd

		int num = 5;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0)

				System.out.println(i + " is an even number");
			else {
				System.out.println(i + " is an odd number");
			}
		}

	}

}
