package StarPatterns;

public class Pattern4 {

	//https://www.javainterviewpoint.com/star-pattern-programs-in-java/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
