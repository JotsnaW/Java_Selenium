package InterviewPrograms;

import java.util.Scanner;

public class Fatorial_inputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for factorial: ");
		int n = sc.nextInt();
		
		while(n>0)
		{
			fact =  fact *n;
			n--;
		}
		System.out.println("Factorial of is: " +fact);
	}

}
