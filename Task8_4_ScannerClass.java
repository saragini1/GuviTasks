package GuviJavaTask;

import java.util.Scanner;

public class Task8_4_ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = scan.nextInt();
		System.out.println("Enter value of b: ");
		int b = scan.nextInt();
		System.out.println("Value of a before swap:" + a);
		System.out.println("Value of b before swap:" + b);
		int temp = a;
		a =b;
		b = temp;
		System.out.println("Value of a after swap:" + a);
		System.out.println("Value of b after swap:" + b);
	}

}
