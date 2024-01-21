package GuviTask;

public class Task8_9_CheckSeniorcitizenOrNot {

	public static void main(String[] args) {
		
		int Yearofbirth = 1975;
		int Currentyear = 2024;
		int Age = (Currentyear - Yearofbirth);
		int SeniorAge = 60;
		if (Age >= SeniorAge) 
			System.out.println("Age is: "+ Age + " Person is a Senior citizen");
			else {
				System.out.println("Age is: "+ Age + " Person is not a Senior citizen");
			}
		}

	}


