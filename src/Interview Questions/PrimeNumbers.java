package InterviewPrograms;

// Prime Numbers are : 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter;
		int n=100;
		for(int i=1; i<=n; i++)
		{
			counter=0;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					counter++;
					break;
				}
			}
			if(counter==0)
			{
				System.out.print(i + " ");
			}
		}
		
	}

}
