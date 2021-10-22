package InterviewPrograms;

import java.util.Scanner;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f1, f2=0, f3=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for Fib series: ");
		int n = sc.nextInt();
		
		
		for (int i=1; i<=n; i++)
		{
			System.out.print(" " +f3);
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
	}

}
