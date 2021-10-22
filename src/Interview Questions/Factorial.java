package InterviewPrograms;

//Factorial of 5 is : 5*4*3*2*1
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1, fact = 1;
		
		while(n<=5)
		{
			fact = fact *n;
			n++;
		}
		System.out.println(fact);
	}
}
