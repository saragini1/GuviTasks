package GuviTask;

public class Task8_10_CountNumberOfDigits {

	public static void main(String[] args) {
		
		
		int count = 0;
		for (int num = 362639874; num != 0; num /= 10, count++) {}
			
			System.out.println("Number of digits is " + count);
		

	}

}
