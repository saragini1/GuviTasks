package GuviJavaTask;

public class Task8_Ten_CountNumberOfDigits {

	public static void main(String[] args) {
		
		
		int count = 0;
		for (int num = 1; num != 0; num /= 10, count++) {}
			
			System.out.println("Number of digits is " + count);
		

	}

}
